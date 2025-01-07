import java.util.Scanner;

public class productsArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4,5};
        int n=arr.length;
        int product=1;
        for(int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println(product);

    }
}
