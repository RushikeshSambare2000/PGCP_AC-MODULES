
import java.io.*;

// Student class
class Student implements Serializable{
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class Deserialization{
    public static void main(String[] args) throws ClassNotFoundException {
        // Student studobj = new Student(01, "Rushikesh", 99.9);
        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
        // try {
            Student stud = (Student)ois.readObject();
        // } catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }

        System.out.println("deserialization successfull..");
        System.out.println("deseialization object :");
        System.out.println(stud);
            fis.close();
            ois.close();

        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
