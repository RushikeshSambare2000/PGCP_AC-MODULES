import java.io.File;
import java.io.IOException;

public class Fileclassdemo {
    public static void main(String[] args) throws IOException {
        File f = new File("demo.txt");

        //getname()
        //exists()
        if(f.exists()){
            System.out.println("exits");
            System.out.println(f.getName());
        }

        //isDirectory
        if(f.isDirectory()){
            System.out.println(f.getName()+" is s directory and contain the foloeing files");
            String [] filenames = f.list();
            for(String s : filenames){
                System.out.println(s);
            }
            
            //listfiles() - return array of file objects
            // File [] files = f.listFiles();
        }

        //mkdir()
        File dir = new File("mydir");
        if(!dir.exists()){
            dir.mkdir();
        }


        // createNewFile()
        File f1 = new File("Mydemo.txt");
        if(!f1.exists()){
            System.out.println(f1.getName()+" does not exits");
            f1.createNewFile();
        }

    }
}
