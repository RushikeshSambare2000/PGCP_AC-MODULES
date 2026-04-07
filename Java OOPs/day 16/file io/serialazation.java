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

public class serialazation {
    public static void main(String[] args) {
        Student studobj = new Student(01, "Rushikesh", 99.9);
        try {
            FileOutputStream fos = new FileOutputStream("demo.txt");
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(studobj);
            fos.close();
            oss.close();

            System.out.println("object save successfully..");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
