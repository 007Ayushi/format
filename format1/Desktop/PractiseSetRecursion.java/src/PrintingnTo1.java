import java.util.Scanner;

public class PrintingnTo1 {

    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        print(n);

    }
}
