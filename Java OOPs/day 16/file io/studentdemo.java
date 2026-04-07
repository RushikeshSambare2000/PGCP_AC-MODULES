import java.io.*;
import java.util.*;

// Student class
class Student {
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

public class studentdemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        try {
            File infile=new File("demo.txt");
            if(infile.exists()==false){
                System.out.println("file not exits");
                return;
            }
            FileReader fr = new FileReader("demo.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                // Example line: 01, rushikesh, 99.9

                String[] data = line.split(",");

                int rollNo = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                double marks = Double.parseDouble(data[2].trim());

                Student s = new Student(rollNo, name, marks);
                list.add(s);
            }

            br.close();

            // Print all students
            for (Student s : list) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}