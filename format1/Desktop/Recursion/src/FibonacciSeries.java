import java.util.Scanner;

public class FibonacciSeries {
    public static int fibo(int n){
        if(n==0 || n==1)return n;
        int i = fibo(n - 1) + fibo(n - 2);
        return i;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibo(n));

    }
}
