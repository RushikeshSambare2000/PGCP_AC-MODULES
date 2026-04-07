import java.io.*;
public class javaIOdemo {
    public static void main(String[] args){
        try{
File inFile = new File("demo.txt");
        File outFile = new File("demotwo.txt");

        if(inFile.exists()==false){
           System.out.println("file does not exist");
           return;
        }
        FileInputStream fis = new FileInputStream(inFile);
        FileOutputStream fos = new FileOutputStream(outFile);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

         int  ch;
         while ((ch=bis.read())!=-1) {
            System.out.print((char)ch);
            fos.write(ch);
         }
        fis.close();
        bos.flush();   // use to flush the buffered file
        fos.close();
        System.out.println("file copied successfully...");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
         
         
    }
}
