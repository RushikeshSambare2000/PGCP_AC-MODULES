package pack1;
import pack.*;

class Test extends demo {
    public static void main(String[] args) {

        Test obj = new Test();

        System.out.println(obj.a); // ✅ public
        System.out.println(obj.d); // ✅ protected (via inheritance)
    }
}
