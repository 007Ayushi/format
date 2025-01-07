public class MinimumValue {
    public static void main(String[] args) {
        int []arr={20,30,28,89,23,88,100,92,9};
        int n=arr.length;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mn=Math.min(mn,arr[i]);
        }
        System.out.println(mn);
    }
}
