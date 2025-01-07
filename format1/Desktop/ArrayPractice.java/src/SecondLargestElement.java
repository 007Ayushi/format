public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {1,23333,344,444,-1111111,7,0};
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(arr[i],mx);
        }
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=mx) {
                smx = Math.max(arr[i], smx);
            }
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
