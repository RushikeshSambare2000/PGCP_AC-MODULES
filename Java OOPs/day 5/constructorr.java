class student {
    String name;
    int rollno;
    float marks;

    //default
    student() {
        System.out.println("default constructor");
    }

    //1 para
    student(String name) {
        System.out.println("one para constructor");
        this.name = name;
    }

    // 2para
    student(String name, int rollno, float marks) {
        this(name);
        System.out.println("two para constructor");
        this.rollno=rollno;
        this.marks=marks;
    }

    void setdata(String name, int rollno, float marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    void getdata() {
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.marks);
    }
}

public class constructorr {
    public static void main(String[] args) {
        student s1;
        System.out.println("ref is created");
        s1 = new student();


        s1.setdata("rushikesh", 101, 99.9f);
        s1.getdata();
       
        System.out.println();
        student s2 = new student("Anuj",102,90.9f);
        s2.getdata();

    }
}