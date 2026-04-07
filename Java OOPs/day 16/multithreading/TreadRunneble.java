class MyThread implements Runnable {
    Thread t;
    public MyThread(){
        t=new Thread(this);
        // t.start();
    }
    
     public MyThread(String tname){
        t=new Thread(this,tname);
        // t.start();
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

public class TreadRunneble {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Thread Started");
        MyThread mt1 = new MyThread(); // runnable object
        MyThread mt2 = new MyThread(); // runnable object
        MyThread mt3 = new MyThread(); // runnable object

        mt1.t.start();
        mt2.t.start();
        mt3.t.start();
        try{
        mt1.t.join();
        mt2.t.join();
        mt3.t.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
     

        /*
        Thread t1 = new Thread(mt1, "MyThread-1"); // to create thread object
        Thread t2 = new Thread(mt2, "MyThread-2"); // to create thread object
        Thread t3 = new Thread(mt3, "MyThread-3"); // to create thread object

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        

        System.out.println(Thread.currentThread().getName() + " Thread Ended");

    }
}
