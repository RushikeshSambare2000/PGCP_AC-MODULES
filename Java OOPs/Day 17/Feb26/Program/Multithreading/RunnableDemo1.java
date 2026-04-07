class MyThread implements Runnable		
{
	Thread t;
	
	public MyThread()
	{
		t = new Thread(this);
		//t.start();
	}
	
	public MyThread(String threadName)
	{
		t = new Thread(this,threadName);
		//t.start();
	}
	
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" thread started");
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName()+" thread ended");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}	
}

class RunnableDemo1
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" thread started");
		
		MyThread mt1 = new MyThread("MyThread1"); //mt1 is Runnable object not Thread object		
		MyThread mt2 = new MyThread("MyThread2");		
		MyThread mt3 = new MyThread("MyThread3");		
		
		//mt1.start();		//ERROR; because mt1 is not Thread object
		mt1.t.start();		
		mt2.t.start();
		mt3.t.start();
		
		//mt1.join();		//ERROR; because mt1 is not Thread object
		mt1.t.join();
		mt2.t.join();
		mt3.t.join();
		
		System.out.println(Thread.currentThread().getName()+" thread ended");
	}
}
