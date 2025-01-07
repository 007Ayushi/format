import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.Scanner;

public class MazePath2 {
    public static int maze(int rows,int cols,int n,int m){
        if(rows==n || cols==m)return 1;
       int rightways=maze(rows,cols-1,n,m);
       int downways=maze(rows-1,cols,n,m);
       return rightways+ downways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter m");
        int m=sc.nextInt();
        System.out.println(maze(n,m,1,1));
    }
}
