import java.util.Scanner;

public class StairPath {

    public static int stairpath(int n){
        if(n==1 || n==2)return n;
        return stairpath(n-1)+stairpath(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(stairpath(n));

    }
}
