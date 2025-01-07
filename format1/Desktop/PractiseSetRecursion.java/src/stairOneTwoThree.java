import java.util.Scanner;

public class stairOneTwoThree {
    public static int stair(int n){
        if(n==1 || n==2)return n;
        if(n==3)return 4;
        return stair(n-1)+stair(n-2)+stair(n-3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(stair(n));
    }
}
