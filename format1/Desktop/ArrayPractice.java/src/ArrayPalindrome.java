public class ArrayPalindrome {
    public static void main(String[] args) {
        int []arr={10,12,12,10,12,10};
        int n=arr.length;
        int i=0,j=n-1;
        while(i<=j){
           if(arr[i]!=arr[j]){
               System.out.println(" not palindrome");
               return;

           }
           else{
               i++;
               j--;
           }
        }
        System.out.println("palindrome");
    }
}
