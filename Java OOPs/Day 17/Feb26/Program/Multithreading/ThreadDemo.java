class MyThread extends Thread		//MyThread is a Thread class.
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" thread started");
	}	
}



class ThreadDemo
{
	public static void main(String args[])
	{
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		
		//start() method
		mt1.start();
		mt2.start();
		mt3.start();
		
	}
}
