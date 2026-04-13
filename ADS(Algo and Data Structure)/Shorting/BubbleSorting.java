public class BubbleSorting{
    static void printarray(int []arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void bubblesort(int [] arr){
        boolean isswap=false;
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isswap=true;
                }
            }

            if(isswap==false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={1,3,5,2,7,3,6};
        bubblesort(arr);
        printarray(arr);
    }
}