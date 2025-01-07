import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=1;j<(2*n-1);j+=2)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
