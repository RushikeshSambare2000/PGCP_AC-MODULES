class MyThread extends Thread { // mythread is a thread class

    public MyThread(String threadname) { // set tread name
        super(threadname);
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": Tread started");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + ": Tread ended");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

public class Threaddemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "Tread started");
        MyThread mt1 = new MyThread("MyThread-1");
        MyThread mt2 = new MyThread("MyThread-2");
        MyThread mt3 = new MyThread("MyTread-3");

        // start() : to start the tread
        mt1.start();
        mt2.start();
        mt3.start();

        try{
          Thread.sleep(2000);      //sleep/pause main tread for 2 sec
          mt1.join();                     //main tread wait for mt1 to complete its task
          mt2.join();
          mt3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
       
      

        System.out.println(Thread.currentThread().getName() + "Tread ended");

    }
}