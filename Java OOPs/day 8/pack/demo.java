package pack;

class Test {
    public static void main(String[] args) {
        demo obj = new demo();

        System.out.println(obj.a); // ✅ public
        // System.out.println(obj.b); ❌ private (NOT accessible)
        System.out.println(obj.c); // ✅ default
        System.out.println(obj.d); // ✅ protected
    }
}

public class demo {
    public int a = 10;       // accessible everywhere
    private int b = 20;      // accessible only in this class
    int c = 30;              // default (package-private)
    protected int d = 40;    // same package + subclass

    void display() {
        System.out.println(a); // ✅
        System.out.println(b); // ✅
        System.out.println(c); // ✅
        System.out.println(d); // ✅
    }
}