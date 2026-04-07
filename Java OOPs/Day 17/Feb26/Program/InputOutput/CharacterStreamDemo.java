import java.io.*;

class CharacterStreamDemo
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
			
			FileReader fr = new FileReader(inFile);
			FileWriter fw = new FileWriter(outFile);  //will create and write
			//FileWriter fw = new FileWriter(outFile,true);  //Will append
			
			int ch;
			while((ch = fr.read()) != -1)
			{
				System.out.print((char)ch);
				fw.write(ch);
			}
			
			fr.close();
			fw.close();
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
