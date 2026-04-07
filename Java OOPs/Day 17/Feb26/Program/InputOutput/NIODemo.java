import java.io.*;
import java.nio.*;
import java.nio.channels.*;

class NIODemo
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis = new FileInputStream("studdetails.csv");
			FileChannel fcin = fis.getChannel();
			ByteBuffer bb = ByteBuffer.allocate((int)fcin.size());
			
			fcin.read(bb);		//Read from channel to buffer
			
			//System.out.println("(int)fcin.size() : " + (int)fcin.size());
			//Read from the buffer
			bb.rewind();
			
			for(int i = 0 ; i < (int)fcin.size(); i++)
			{
				System.out.print((char)bb.get(i));
			}
			
			//Write to the file
			bb.rewind();
			FileOutputStream fos = new FileOutputStream("studdetailscopy.csv");
			FileChannel fcout = fos.getChannel();
			fcout.write(bb);
			
			//System.out.println("(int)fcout.size() : " + (int)fcout.size());
			
			
			fcin.close();
			fis.close();
			fcout.close();
			fos.close();
			
			System.out.println("I/O operation completed successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
