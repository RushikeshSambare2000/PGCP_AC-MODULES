class Test {
    public void methodOne(int i, float f) {
        System.out.println("int-float method");
    }

    public void methodOne(float f, int i) {
        System.out.println("float-int method");
    }
}

//
class Test2 {
    public void methodTwo(int i) {
        System.out.println("general method");
    }

    public void methodTwo(int... i) {
        System.out.println("var-arg method");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Test t = new Test();
        t.methodOne(10, 10.5f);// int-float method
        t.methodOne(10.5f, 10);// float-int method
        // t.methodOne(10, 10); // CE:reference to methodOne is ambiguous, both method and method methodOne(float,int) in Test match
        // t.methodOne(10.5f, 10.5f);// C.E: cannot find symbol symbol : methodOne(float, float) location : class Test
        Test2 t2 = new Test2();
        t2.methodTwo();// var-arg method
        t2.methodTwo(10, 20);// var-arg method
        t2.methodTwo(10);// general method
        t2.methodTwo( 10,20,202,22,22);// var-arg method

    }
}
