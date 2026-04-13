public class ArraySearch{

    static int binaryserach(int []arr,int target){
       int arr_len=arr.length;
        int start=0;
        int end=arr_len-1;
        // target=28;

        while (start<=end) {
            int mid=start+(end-start)/2;
            // System.out.println(mid);
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
               start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int []arr={10,12,15,21,22,28,50};
        int res =binaryserach(arr,28);
        System.out.println(res);
        
    }
}