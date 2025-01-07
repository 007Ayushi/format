import java.util.Scanner;
public class PrintSum1ToN {

    public static int  sum(int n){
        if(n==0 || n==1)return n;
        int ans=n+sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}



