class MyThread implements Runnable		
{
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

class RunnableDemo
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" thread started");
		
		MyThread mt1 = new MyThread();		//Not a thread object, it is Runnable object
		MyThread mt2 = new MyThread();		//Not a thread object, it is Runnable object
		MyThread mt3 = new MyThread();		//Not a thread object, it is Runnable object
		
		//Thread t1 = new Thread(mt1);			//Now it is Thread object
		Thread t1 = new Thread(mt1,"MyThread1");	//Now it is Thread object
		Thread t2 = new Thread(mt2,"MyThread2");	//Now it is Thread object
		Thread t3 = new Thread(mt3,"MyThread3");	//Now it is Thread object
		
		//t1, t2, t3 are Thread object.
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println(Thread.currentThread().getName()+" thread ended");
	}
}
