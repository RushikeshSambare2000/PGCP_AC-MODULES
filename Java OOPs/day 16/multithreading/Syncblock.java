
class MessagePrinter{
    
    public void printMessage(String msg) throws InterruptedException{   //syncronized method
        // Thread.sleep(1000);
        System.out.print("[");
        // Thread.sleep(1000);
        System.out.print(msg);
        // Thread.sleep(1000);
        System.out.print("]");
    }
};


class MyThread implements Runnable{
    Thread t;
    MessagePrinter mp;
    String msgToPrint;
    MyThread(MessagePrinter mp, String mString){
        t=new Thread(this);

        this.mp=mp;
        this.msgToPrint=mString;

        t.start();
    }

    public void run(){
       
        try {
              synchronized(mp){                         //sync block 
                 mp.printMessage(msgToPrint);
              }
           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}



public class Syncblock {
    public static void main(String[] args) {
        MessagePrinter mp = new MessagePrinter();
        MyThread mt1 = new MyThread(mp, "Hello");
        MyThread mt2 = new MyThread(mp, "friends");
        MyThread mt3 = new MyThread(mp, "Welcome");
    }
}



