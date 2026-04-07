import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class nonBlockingIO {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("demo.txt");

            // create channel
            FileChannel fcin = fis.getChannel();
            // allocate memory to buffer
            ByteBuffer bb = ByteBuffer.allocate((int) fcin.size());

            // read cahnnel to buffer
            fcin.read(bb);

            //read from buffer
            bb.rewind();
            System.out.println((int) fcin.size());
            for(int i=0; i<(int) fcin.size(); i++){
                System.out.print((char)bb.get(i));
            }
            

            //write content from demo to console.txt
            bb.rewind();
            FileOutputStream fos = new FileOutputStream("console.txt", true);
            FileChannel fos_channel = fos.getChannel();
            fos_channel.write(bb);

            fcin.close();
            fis.close();

            System.out.println(" operation completed..");
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
