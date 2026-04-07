class MessagePrinter
{
	public void printMessage(String msg)		//SynchronizedMethod
	{
		try
		{
			Thread.sleep(2000);
			System.out.print("[");
			Thread.sleep(2000);
			System.out.print(msg);
			//Thread.sleep(2000);
			System.out.print("]");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class MyThread implements Runnable
{
	Thread t;
	MessagePrinter mp;
	String msgToPrint;
	
	MyThread(MessagePrinter mp, String msgToPrint)
	{
		t = new Thread(this);
		this.mp = mp;
		this.msgToPrint = msgToPrint;
		
		t.start();
	}
	
	public void run()
	{
		synchronized(mp)			//Synchronized Block
		{
			mp.printMessage(msgToPrint);
		}
	}
}

class SynchronizedBlockDemo
{
	public static void main(String args[])
	{
		MessagePrinter mp = new MessagePrinter(); //To be shared with multiple threads
		
		MyThread mt1 = new MyThread(mp,"Hello");
		MyThread mt2 = new MyThread(mp,"Friends");
		MyThread mt3 = new MyThread(mp,"Welcome");	
	}
}
