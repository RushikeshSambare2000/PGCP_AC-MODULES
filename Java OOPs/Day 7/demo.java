/*
single 
parent  -- base 
child   -- dervied

multilevel
class a ---> class b --- class c 

hierarchical 


multiple 
hybrid
*/
// class parent {
//     int a = 10;

//     parent() {
//         System.out.println("parent ");
//     }

//     void showparent() {
//         System.out.println("parent method");
//     }
// }

// class child extends parent {
//     child() {
//         System.out.println("child");
//     }

//     void show() {
//         System.out.println("child method");
//     }
// }

// public class demo {
//     public static void main(String[] args) {
//         child c = new child();
//         c.show();
//         c.showparent();

//         parent p1 = new parent();
//         p1.showparent();
//         // p1.show(); // not work

//         parent p2 = new child();
//         p2.showparent();
//         // p2.show(); // not work

//         // child c2 =new parent(); // not allowed
//     }
// }

// multilevel
// class a ---> class b --- class c
// class a {
//     void showa() {
//         System.out.println("class a");
//     }
// }

// class b  extends a{
//     void showb() {
//         System.out.println("class b");
//     }
// }

// class c extends b{
//     void showc(){
//         System.out.println("class c");
//     }
// }

// public class demo {
//     public static void main(String[] args) {
//         a base = new a();
//         base.showa();

//         b base2 = new b();
//         base2.showa();
//         base2.showb();
        
//         c base3= new c();
//         base3.showa();
//         base3.showa();
//         base3.showb();

//     }
// }


// hierarchical
// parent---- child 1
//       -----child 2




class a {
    void showa() {
        System.out.println("class a");
    }
}

class b  extends a{
    void showb() {
        System.out.println("class b");
    }
}

class c extends b{
    void showc(){
        System.out.println("class c");
    }
}

public class demo {
    public static void main(String[] args) {
        a base = new a();
        base.showa();

        b base2 = new b();
        base2.showa();
        base2.showb();
        
        c base3= new c();
        base3.showa();
        base3.showa();
        base3.showb();

    }
}
