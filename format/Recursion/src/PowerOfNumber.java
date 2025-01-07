import java.util.Scanner;
public class PowerOfNumber {
    public  static int pow(double a,double b)
    {
        double power=Math.pow(a,b);
        return (int) power;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        System.out.println(pow(a,b));
    }
}
