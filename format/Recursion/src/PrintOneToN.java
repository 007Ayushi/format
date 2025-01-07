import java.util.Scanner;
public class PrintOneToN {
    static int n;//global variable
    public static void print(int x){
    if(x>n) return;;//base case
        System.out.println(x);//work
        print(x+1);//call
       }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
       n=sc.nextInt();
        print(1);

    }
}
