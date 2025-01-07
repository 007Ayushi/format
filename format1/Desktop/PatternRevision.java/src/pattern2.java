import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n+1-i);j++){
                char ch=(char)(i+64);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
