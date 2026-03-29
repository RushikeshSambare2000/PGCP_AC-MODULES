import java.util.*;
class contact{
    String mobno;
    String Address;
    String Email;
    contact(String mobno, String Address, String Email){
        this.mobno=mobno;
        this.Address=Address;
        this.Email=Email;
    }
    void display_contact(){
        System.out.println("mobile number: "+this.mobno);
        System.out.println("mobile address: "+this.Address);
        System.out.println("mobile email: "+this.Email);

    }
}

class student{
    int rollno; 
    String name; 
    float marks;
    contact c1;
    // student(){

    // }
    student(int rollno, String name, float marks, contact c1){
         this.rollno=rollno;
         this.name=name;
         this.marks=marks;
         this.c1=c1;
    }

    void display_student(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Marks: "+marks);
        c1.display_contact();
        System.out.println();
    }
}

public class StudentDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student");
        int n=sc.nextInt();
        student[] students =new student[n];
        
        for(int i=0; i<students.length; i++){
            System.out.println("Enter Roll :");
            int rollno=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name :");
            String name=sc.nextLine();
            System.out.println("Enter Marks :");
            float marks=sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter mob no :");
            String mobno=sc.nextLine();
            System.out.println("Enter adress:");
            String address = sc.nextLine();
            System.out.println("Enter Email :");
            String Email=sc.nextLine();

            contact c1=new contact(mobno, address, Email);
            students[i] =new student(rollno, name, marks, c1);
        }
        // contact c1=new contact("9604053371", "pune", "abc@gmail.com");
        // contact c2=new contact("9604053432", "mumbai", "axyz@gmail.com");
        // students[0] =new student(12, "Rhsikesh", 99.9f, c1);
        // students[1] =new student(13, "Anuj", 99f, c1);
        System.out.println(students[0].c1.Address);

        
        for(student s1 :students){
           s1.display_student();
           System.out.println("----------------");
        }
    }
}
