import java.util.Scanner;

public class PrintOneToN {
//    public static int  print(int x,int n){
//        if(x>n)return n;
//        else
//        {
//            System.out.println(x);
//            print(x+1,n);
//        }
//        return 1 ;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        print(1,n);
//
//    }
    static int n;
    public static void print(int x){
        if(x>n)return;
        System.out.println(x);
        print(x+1);

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        print(1);
    }

}
