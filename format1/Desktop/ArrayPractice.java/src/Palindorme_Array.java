public class Palindorme_Array
{
    public static void main(String[] args) {
        int[]arr={1,2,3,2,1};
        int m=arr.length;
        int flag=0;
        for(int i=0;i<m/2;i++){
            if(arr[i]!=arr[m-i-1]){
                flag=1;
                System.out.println("not palindromic array");
                break;
            }
        }
        if(flag==0){
            System.out.println("palindromic array");
        }
    }
}
