
// polymosrphism : same name but diff form 
//  abs()  - int float and long  

// polymosrphism
// 1. compile time / static binding / early binding  -- Method Overloading
// 2. runtime / dynamic binding / late  binding      -- method overrring 

// 1. method overloading 
//   void  showdetails(int id )
//   void showdetails(String name) 

class demo {
    public void methodOne() {
        System.out.println("no-arg method");
    }

    public void methodOne(int i) {
        System.out.println("int-arg method"); // overloaded methods
    }
    public void methodOne(double d) {
        System.out.println("double-arg method");
    }

 public static void main(String[] args) {
 demo d=new demo();
 d.methodOne();//no-arg method
 d.methodOne(10);//int-arg method
 d.methodOne(10.5);//double-arg method
 }
}