class ArrayBasic{
    static int arr[] = new int[10];

    //insert
    public static void insert(int [] arr, int index, int value){
            if(index<10 && index>=0){
               arr[index]=value;
            }
        }


        //delete 
        public static void delete(int []arr, int index, int value){
            for(int i=0; i<arr.length; i++){
                if(arr[i]==value){
                    arr[i]=0;
                }
            }
        }

          // display
    
        public static void Display(int []arr){
            for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        }

        //even number via recursion
        static int  even(int num){
          if(num==0){
            return 0;
          }else{
             System.out.println(num);
            return 2+even(num-1);
           
          }
        }

    public static void main(String [] args){
    //  Display(arr); 
    //  insert(arr,0, 10);  
    //  Display(arr);      

    //  delete(arr, 0, 10);
    //  Display(arr);
     System.out.println(even(5));
     
    }
}