import java.util.Scanner;

public class PowerBylograithmic {

    public static int pow2(int a,int b){
        if(b==0)return 1;
        int ans=pow2(a,b/2);
        if(b%2==0)return ans*ans;
        return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       int b=sc.nextInt();
        System.out.println(pow2(2,3));

    }
}
