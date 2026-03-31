public class equaldemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2); // true     === ref   equal --> 
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s3.equals(s4)); // true

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuffer sb3 = new StringBuffer("Hello");
        StringBuffer sb4 = new StringBuffer("Hello");
        StringBuffer sb5 =sb4;

        System.out.println(sb3 == sb4); // false
        System.out.println(sb3.equals(sb4)); // false

        System.out.println(sb1 == sb2); // false
        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb5==sb4);   //true

    }
}
