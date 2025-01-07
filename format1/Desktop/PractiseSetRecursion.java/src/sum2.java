import java.util.Scanner;

public class sum2 {
    public static int sum(int n){
        if(n==1 || n==0)return n;
        return n+sum(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( sum(n));
    }


}
