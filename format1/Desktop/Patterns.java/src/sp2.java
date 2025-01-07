import  java.util.Scanner;
public class sp2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j || i==4 && j== 2 || i==2 && j==4 || i==1 && j==5 || i==5 && j==1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
