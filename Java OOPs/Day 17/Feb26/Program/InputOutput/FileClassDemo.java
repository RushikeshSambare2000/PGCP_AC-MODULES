import java.io.*;

class FileClassDemo
{
	public static void main(String args[]) throws IOException
	{
		//File f = new File("myfile.csv");
		File f = new File("/home/shivnath/DAC/Feb26/Program/InputOutput/Serialization");
		
		//exists(), getName()
		
		if(f.exists())
		{
			System.out.println(f.getName() + " exists!"); 
		}
		else
		{
			System.out.println(f.getName() + " does not exist!"); 
		}
		
		//isDirectory()
		
		if(f.isDirectory())
		{
			System.out.println(f.getName() + "is a directory. It contains the following files:"); 
			//list(): returns array of file names.
			String []fileNames = f.list();
			
			for(String fname: fileNames)
			{
				System.out.println(fname);
			}
			
			//listFiles() returns array of File objects
			File []files = f.listFiles();
			
			System.out.println("Iterating file object array: ");
			for(File fl : files)
			{
				System.out.println(fl.getName());
			}
			
		}
		
		File dir = new File("mydir");
		
		//mkdir()
		if(!dir.exists())
		{
			System.out.println(dir.getName() + " does not exists. Creating new directory..");
			dir.mkdir();		//Will create the directory
		}
		
		//createNewFile()
		File f1 = new File("myfile.txt");
		if(!f1.exists())
		{
			System.out.println(f1.getName() + " does not exists. Creating new file..");
			f1.createNewFile();
		}
	}
}
