class Test {
    void show(int a) {
        System.out.println("int method");
    }

    void show(double a) {
        System.out.println("double method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show(10.5f);     
        t.show('A');   
    }
}
