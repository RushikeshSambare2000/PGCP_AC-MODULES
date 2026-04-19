/*
1. Whatever the Parent has by default available to the Child through inheritance, if
the Child is not satisfied with Parent class method implementation then Child is 
allow to redefine that Parent class method in Child class in its own way this
process is called overriding.
2. The Parent class method which is overridden is called overridden method.
3. The Child class method which is overriding is called overriding method.

4. In overriding method resolution is always takes care by JVM based on runtime
object hence overriding is also considered as runtime polymorphism or dynamic
polymorphism or late binding.
30. The process of overriding method resolution is also known as dynamic method
dispatch.

Rules for Overridng.
In overriding method names and arguments must be same. That is method
signature must be same.
2. Until 1.4 version the return types must be same but from 1.5 version onwards covariant return types are allowed.
3. According to this Child class method return type need not be same as Parent
class method return type its Child types also allowed. 

*/

class Parent{
    public  void future(){
        System.out.println(" my son will be engineer");
    }
}

class child extends Parent{
    // public void future(){
    //     System.out.println("i want to become a doctor");
    // }
}
public class overriding{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.future();     //my son will be engineer

        child c = new child();
        c.future();    //i want to become a doctor

        Parent p1 = new child();
        p1.future();

    }
}