import java.util.Objects;
class Student{
    int roll;
    String name;
    Student(int roll,String name){
        this.name = name;
        this.roll = roll;
    }
    public int hashCode(){
        // return this.roll*2; // it will return the hashcode of the object in decimal format.
        return Objects.hash(roll,name); // it will return the hashcode of the object in decimal format.
    }
    public String toString(){
        //String s = "Student [roll = "+this.roll+" , name = "+this.name+"]"; // it will return the string representation of the object in the form of ClassName@HashCode of the object.
        //return s;
        return "Student [roll = "+this.roll+" , name = "+this.name+"]"; // it will return the string representation of the object in the form of ClassName@HashCode of the object.
    }
    public boolean equals(Object obj){
        if (obj == null){ // it will check if the object is null or not.
            return false;
        }
        Student s = (Student)obj; // downcasting of the object to Student class because the parameter of the equals() method is of type Object class and we want to compare the content/data of the object and not the reference of the object.
        if (this.roll == s.roll && this.name == s.name) // it will compare the content/data of the object and not the reference of the object.
            return true;
        return false;
    }
}


class ObjMethodOverloadig {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Sachin");
        Student s2 = new Student(2,"Geeta");
        Student s3 = new Student(1,"Sachin");
        System.out.println("s1 :- "+s1); // it will print the string representation of the object s1 in the form of ClassName@HashCode of the object.
        System.out.println("s2 :- "+s2); // it will print the string representation of the object s2 in the form of ClassName@HashCode of the object.
        if (s1.equals(s2)){ // it will be false because both the references are pointing to different objects in the memory if not overridden.
            System.out.println("Both s1 and s2 are equal");
        } else {
            System.out.println("Both s1 and s2 are not equal");
        }
        if (s1.equals(s3)){ // it will be false because both the references are pointing to different objects in the memory if not overridden.
            System.out.println("Both s1 and s3 are equal");
        } else {
            System.out.println("Both s1 and s3 are not equal");
        }

    }
}