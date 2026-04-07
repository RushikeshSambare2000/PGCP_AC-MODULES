import java.io.*;

class ByteStreamDemo
{
	public static void main(String args[])
	{
		try
		{
			//File inptFile = new File("/home/shivnath/DAC/Feb26/Program/InputOutput/studdetails.csv");		//Absolute path of the file
			
			File inFile = new File("studdetails.csv");     //relative path wrt current folder
			File outFile = new File("studdetailscopy.csv");
			
			if(inFile.exists() == false)
			{
				System.out.println("File does not exist!");
				return;
			}
			
			FileInputStream fis = new FileInputStream(inFile);
			FileOutputStream fos = new FileOutputStream(outFile);  //will create and write
			//FileOutputStream fos = new FileOutputStream(outFile,true);  //Will append
			
			int ch;
			while((ch = fis.read()) != -1)
			{
				System.out.print((char)ch);
				fos.write(ch);
			}
			
			fis.close();
			fos.close();
			System.out.println("File is copied successfully!!");	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
