import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class MazePath {
    public static int maze(int rows,int col,int n,int m){
        if(rows==n || col==m)return 1;
       int rightways=maze(rows,col+1,n,m);
       int downways=maze(rows+1,col,n,m);
       return rightways+downways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter m");
        int m=sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println( maze(1,1,n,m));
    }
}
