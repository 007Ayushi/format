public class CountingElementsGreaterThanx {
    public static void main(String[] args) {
        int[] arr = {10, 2, 90, 3, 20, 30, 10, 20, 30, 40, 50};
        int n = arr.length;
        int x = 30;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                System.out.print(arr[i] + " ");
            }
      }
        largestThreeElement(arr);
    }
       public static void largestThreeElement(int []arr){
            int mx=Integer.MIN_VALUE;
            int n=arr.length;
            for(int i=0;i<n;i++){
                mx=Math.max(mx,arr[i]);
            }
            int smx=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]!=mx){
                    smx=Math.max(smx,arr[i]);
                }
            }
            int thirdmax=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]!=mx && arr[i]!=smx){
                    thirdmax=Math.max(thirdmax,arr[i]);
                }
            }
            System.out.println(mx);
            System.out.println(smx);
            System.out.println(thirdmax);
        }



}
