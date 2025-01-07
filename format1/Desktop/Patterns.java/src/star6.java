import java.util.Scanner;
public class star6 {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=65;i<=68;i++){
            for(int j=65;j<=i;j++){
                char ch=(char)j;
                System.out.print(ch);
            }
            System.out.println();
        }
    }

}
