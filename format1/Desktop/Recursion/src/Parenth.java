import java.util.Scanner;


public class Parenth {
    public static void printparenth(String ans,int n,int open,int close ){
        int m=ans.length();
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
        if(open<n) {
            printparenth(ans + "(", n, open + 1, close);


        }
        if(close<open)
            printparenth(ans+")",n,open,close+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printparenth("",n,0,0);
    }
}
