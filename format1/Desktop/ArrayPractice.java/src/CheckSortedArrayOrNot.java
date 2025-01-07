public class CheckSortedArrayOrNot {
    public static void main(String[] args) {
        //int[] arr = {10, 45, 23, 11, 89, 2, 40, 3, 15, 89};
        //int []arr={1,2,3,4};
        int []arr={10,9,8,7};
        int n = arr.length;
       // sorted(arr);
        issorted(arr);



        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sorted(int[] arr) {
        int n = arr.length;
        for (int x = 0; x < n; x++) {
            for (int i = 0; i < n - x - 1; i++) {
                if (arr[i] > arr[i+1] ) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
  public static void issorted(int []arr){
        int i=0,j=1;
       if(arr[i]<=arr[j]){
           while(j<arr.length){
               if(arr[i]>arr[j]){
                   System.out.println("not sorted");
                   return;
               }
               else{
                   i++;
                   j++;
               }
           }
       }
       else {
           while(j<arr.length){
               if(arr[i]<arr[j]){
                   System.out.println("not sorted");
                   return;
               }
               else{
                   i++;
                   j++;
               }
           }

       }
      System.out.println("sorted");
  }
}

