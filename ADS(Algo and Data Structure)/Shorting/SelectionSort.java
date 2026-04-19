public class SelectionSort {
    static void printarray(int []arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

  

    static void selectionsort(int [] arr){
       int n = arr.length;
       for(int i=0; i<n-1; i++){
        int smallindex=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[smallindex]){
                smallindex=j;
            }
        }
        int temp=arr[smallindex];
        arr[smallindex]=arr[i];
        arr[i]=temp;
       }
    
    }

    
    public static void main(String[] args) {
        int []arr={1,3,5,2,7,3,6};
        selectionsort(arr);
        printarray(arr);
    }
}
