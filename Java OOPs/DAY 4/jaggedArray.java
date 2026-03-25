import java.util.Scanner;
public class jaggedArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int [3][];
        System.out.println("enter jagged array size");
        for(int i=0; i<arr.length; i++){
            int n=sc.nextInt();
            arr[i]=new int[n];
        }
        System.out.println("enter element in array");
        for(int i=0; i<arr.length; i++){
            System.out.println("add element for"+i+"index");
            for(int j=0; j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
    }
}
