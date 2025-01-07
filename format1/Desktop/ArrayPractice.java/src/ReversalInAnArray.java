public class ReversalInAnArray {
    public static void main(String[] args) {
        int []arr={2,4,8,10,12,14};
       swap(arr);
       for(int ele:arr){
           System.out.print(ele+" ");
       }
        System.out.println();
    }
    public static void swap(int []arr){
        int n=arr.length;
      for(int i=0;i< arr.length/2;i++){
          int temp=arr[i];
        arr[i]=  arr[n-i-1];
        arr[n-i-1]=temp;
        }
    }
}
