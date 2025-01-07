public class BubbleSortQues {
    public static void main(String[] args) {
        int []arr={3,5,1,6,0};
        int n=arr.length;
        for(int x=0;x<n-1;x++) {
            for (int i = 0; i < n - x - 1; i++) {
                if (arr[i] <arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
            for(int ele:arr){
                System.out.print(ele+" ");
            }
        System.out.println();
    }
}
