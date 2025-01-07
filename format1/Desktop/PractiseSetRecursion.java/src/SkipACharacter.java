public class SkipACharacter {
    public static void skipping( String str, int i,String ans) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        if (str.charAt(i) != 'a') {
            ans += str.charAt(i);
        }
        skipping( str,i + 1, ans);
    }


    public static void main(String[] args) {
        String str = "ayushi";
        //skipping( str,0, " ");
        int arr[] = {1,2,3,4,5,6,7};
        printArray(arr,0);
    }

    public static  void printArray(int arr[],int i ) {
        if(i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr,i+1);
}

}