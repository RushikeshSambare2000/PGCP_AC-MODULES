class Tostring {
    String name;
    int rollno;

    Tostring(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String toString() {
        return getClass().getName() + "@" +
                Integer.toHexString(hashCode());
    }

    public static void main(String args[]) {
        Tostring s1 = new Tostring("saicharan", 101);
        Tostring s2 = new Tostring("ashok", 102);
        System.out.println(s1);  
        System.out.println(s1);
        System.out.println(s2);
    }
}
// Output:
// Student@3e25a5
// Student@3e25a5
// Student@19821f