public class InsertionSort {
    static void printarray(int []arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

  












    static void insertionsort(int [] arr){
    int n = arr.length;

    //   int []arr={5,3,4,1};  

       for(int i=1; i<n; i++){
        int curr=arr[i];
        int prev = i-1;

        while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            printarray(arr);
            System.out.println();
            prev--;
        }
        arr[prev+1]=curr;
       }
       
    }
















    public static void main(String[] args) {
        int []arr={5,2,9,1,6};
        insertionsort(arr);
        printarray(arr);
    }
}

