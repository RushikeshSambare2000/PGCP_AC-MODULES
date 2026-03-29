
class change{
    int a=10;
    int b=20;
}
class swapNum{
    void swap(change c1){
        int temp=c1.a;
        c1.a=c1.b;
        c1.b=temp;
    }
};

// class swapNum{
//     void swap(int num1, int num2){
//         int temp=num1;
//         num1=num2;
//         num2=temp;
//     }
// };


public class CallByValue {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swapNum s = new swapNum();

        System.out.println(a);
        System.out.println(b);
        // s.swap(a, b);
        System.out.println("a and b after swap");
        System.out.println(a);
        System.out.println(b);
        change c1= new change();

        System.out.println("change object parameter by ref");
        s.swap(c1);
        System.out.println(c1.a);
        System.out.println(c1.b);
    }
}
