import java.util.Scanner;
public class star5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=4;i++){
            for(int j=65;j<=68;j++){
                char ch=(char)j;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

