import java.util.Scanner;

public class StairOneTwo {
    public static int stair(int n){
        if(n==1 || n==2)return n;
        else {
            return stair(n-1)+stair(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(stair(n));
    }
}
