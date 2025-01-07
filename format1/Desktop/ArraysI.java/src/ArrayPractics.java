import java.util.Arrays;

public class ArrayPractics {

    public static void product(int []arr){
        int product=1;
        for(int i=1;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println("product of all elements in an array"+product);
    }
    public static void seclargest(int []arr){
        int mx=Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>mx){
               smx=mx;
               mx=arr[i];
           }
       }
        System.out.println("smallest value in the array"+smx);
    }
    public static void minimum(int []arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in the array is"+min);
    }
    public static void findDuplicates(int []arr) {
        int []ans=new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicates = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == ans[j]) {
                    isDuplicates = true;
                    break;
                }
            }
            if (!isDuplicates) {
                ans[index++] = arr[i];
            }
        }
        System.out.print("duplicates element in the array");
        for(int i=0;i<index;i++){
            System.out.print(ans[i]+" ");
        }

        }

    public static void main(String[] args){
        int []arr={1,0,3,-4,5,5,4,3,2,2,3,1,10};
        int n=arr.length;
        product(arr);
        seclargest(arr);
        minimum(arr);
        findDuplicates(arr);
    }
}
