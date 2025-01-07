import java.util.Scanner;

public class SumOddNumbers {
    public static void sum(int a,int b,int s,int x){
        if(x>b){
            System.out.print(s);
            return;
        }
        if(x%2!=0){
            sum(a,b,s+x,x+1);
        }
        else
        {
            sum(a,b,s,x+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b,0,a);
    }
}
