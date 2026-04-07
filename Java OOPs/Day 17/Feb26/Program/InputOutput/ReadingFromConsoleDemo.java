import java.io.*;

class ReadingFromConsoleDemo
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			String inputStr = null;
			
			System.out.println("Enter roll");
			inputStr = br.readLine();
			int roll = Integer.parseInt(inputStr);
			
			System.out.println("Enter name");
			String name = br.readLine();
			
			System.out.println("Enter marks");
			inputStr = br.readLine();
			double marks = Double.parseDouble(inputStr);
			
			System.out.println("Enter Gender(M/F)");
			inputStr = br.readLine();
			char gender = inputStr.charAt(0);
			
			System.out.println("Attendance more than 80% (true/false): ");
			inputStr = br.readLine();
			boolean isAttendanceComplete = Boolean.parseBoolean(inputStr);
			
			System.out.println("Entered details are:");
			System.out.println(roll + "," + name + "," + marks + "," + gender + "," + isAttendanceComplete);
			
			bw.write(roll + "," + name + "," + marks + "," + gender + "," + isAttendanceComplete);
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}



