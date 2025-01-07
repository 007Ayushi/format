import java.util.Scanner;
public class PrintInputToOne {

    public static void  Print(int n){
        if (n==0)return;//base  call
        System.out.println(n);//work
        Print(n-1);//call
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
       Print(n);
      
    }
   
}
