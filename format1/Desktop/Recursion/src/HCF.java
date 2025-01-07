import java.util.Scanner;

public class HCF {
    public static void hcf(int a,int b){
        if(b%a==0){
            System.out.println(a);
            return;
        }
        hcf(b%a,a);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        hcf(a,b);

    }
}
