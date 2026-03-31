
// public class defaultexception {
//     public static void main(String[] args) {
//         doStuff();
//         printo();
//     }

//     public static void doStuff() {
//         doMoreStuff();
//     }

//     public static void doMoreStuff() {
//         System.out.println(10 / 0);
//     }

//      public static void printo(){
//         System.out.println("Operation done...");
//     }
// }


public class defaultexception {
    public static void main(String[] args) {
        doStuff();
        printo();
    }
    public static void doStuff() {
        doMoreStuff();
    }
    public static void doMoreStuff() {
        try{
          System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmatic exception occure");
        }    
    }
    public static void printo(){
        System.out.println("Operation done...");
    }

}
