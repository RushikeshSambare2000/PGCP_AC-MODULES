import java.io.*;

public class consolewrite {
    public static void main(String[] args) {
        try{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        File outfile = new File("demo.txt");
        FileWriter fw = new FileWriter(outfile);
        BufferedWriter brr = new BufferedWriter(fw);
 
        String inputStr=null;

        System.out.println("Enter roll : ");
        inputStr=br.readLine();
        int roll = Integer.parseInt(inputStr);
         System.out.println("Enter Name : ");
        String name =br.readLine();

        System.out.println("Enter Marks : ");
        inputStr=br.readLine();
        double marks = Double.parseDouble(inputStr);

        System.out.println("enter details are : ");
        System.out.println(roll +" "+name+" "+marks);


        brr.write(roll +" "+name+" "+marks);
        brr.close();
        }catch(FileNotFoundException e ){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        

    }
}
