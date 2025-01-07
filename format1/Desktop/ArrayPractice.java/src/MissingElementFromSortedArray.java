public class MissingElementFromSortedArray {
    public static void main(String[] args) {
        int []arr={10,43,78,11,89,32,46};
        int n=arr.length;
       for(int x=0;x<n;x++){
           for(int i=0;i<n-x-1;i++){
               if(arr[i]>arr[i+1]){
                   int temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
               }
           }
           }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
       }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("missing element from the array is"+arr[0]);
            break;
        }

    }
}
