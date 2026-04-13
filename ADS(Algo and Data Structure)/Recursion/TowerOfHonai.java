import java.lang.Math;
public class TowerOfHonai {
    static void TOH(int n, char source, char helper, char destination){
        if(n==1){
            System.out.println("move disk 1 from "+source+" to "+destination);
            return;
        }
        TOH(n-1, source,destination,helper);
        System.out.println("move disk "+n+" from "+source+" to "+destination);
        TOH(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n=4;
        TOH(n, 'A', 'B', 'C');

        System.out.println("no of move :"+(int)(Math.pow(n, 2)-1));
    }
}
