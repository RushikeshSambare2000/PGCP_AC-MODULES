import java.io.*;

class BufferedCharacterStreamDemo
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
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			/*int ch;
			while((ch = br.read()) != -1)
			{
				System.out.print((char)ch);
				bw.write(ch);
			}*/
			
			
			String line;
			while ((line = br.readLine()) != null)
			{
				/*String arr[] = line.split(",");
				int roll = Integer.parseInt(arr[0]);
				String name = arr[1];
				double marks = Double.parseDouble(arr[2]);
				studList.add(new Student(roll,name,marks));*/
				
				System.out.println(line);
				bw.write(line);
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
