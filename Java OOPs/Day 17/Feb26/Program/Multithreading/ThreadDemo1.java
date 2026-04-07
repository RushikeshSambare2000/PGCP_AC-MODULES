class MyThread extends Thread		//MyThread is a Thread class.
{
	public MyThread(String threadName)
	{
		super(threadName);
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

class ThreadDemo1
{
	public static void main(String args[]) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" thread started");
		
		MyThread mt1 = new MyThread("MyThread1");
		MyThread mt2 = new MyThread("MyThread2");
		MyThread mt3 = new MyThread("MyThread3");
		
		//start() method
		mt1.start();
		mt2.start();
		mt3.start();

		//join() method
		mt1.join();		//Main thread waiting here for mt1 to complete its task and join
		mt2.join();		//Main thread waiting here for mt2 to complete its task and join
		mt3.join();		//Main thread waiting here for mt3 to complete its task and join 				
		
		//Thread.sleep(1000);	//Main thread will sleep/pause
		
		System.out.println(Thread.currentThread().getName()+" thread ended");
	}
}
