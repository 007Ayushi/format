import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number u want the factorial of");
        int n=sc.nextInt();
        System.out.print("answer is" +factorial(n));
    }
    public static int factorial(int n)
    {
        if(n==1)return 1;//base case
        int ans=n*factorial(n-1);
        return ans; //recursive call
    }

}
