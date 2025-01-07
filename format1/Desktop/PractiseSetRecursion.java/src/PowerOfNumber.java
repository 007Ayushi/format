import java.util.Scanner;

public class PowerOfNumber {
    public static int power(int a,int b){
        if(b==0)return 1;
        else {
            return a*power(a,b-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("b");
        int b=sc.nextInt();
        System.out.println(power(2,3));

    }
}
