import java.io.*;

public class Characterstream {

    public static void main(String[] args) {
        try {
            File inFile = new File("demo.txt");
            File outFile = new File("demotwo.txt");

            if (inFile.exists() == false) {
                System.out.println("file does not exist");
                return;
            }
            FileReader fr = new FileReader("demo.txt");
            FileWriter fw = new FileWriter("demotwo.txt");

            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);

            // int ch;
            // while ((ch=br.read())!=-1) {
            // System.out.print((char)ch);
            // fw.write(ch);
            // }

            String line;
            while ((line = br.readLine()) != null) {
                System.out.print(line);
                bw.write(line);
            }

            fr.close();
            fw.close();
            System.out.println("file copied successfully...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
