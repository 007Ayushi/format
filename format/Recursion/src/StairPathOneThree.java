import java.util.Scanner;

public class StairPathOneThree {
    public  static int stair(int n){
        if(n<=0) return -1;
        else if( n==1 || n==2)return 1;
        else if(n==3)return 2;
         else
             return  stair(n-1)  + stair(n-3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println(stair(n));
    }
}
