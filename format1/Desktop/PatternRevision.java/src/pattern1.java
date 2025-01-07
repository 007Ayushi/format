import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                char ch=(char)(j+64);
//                System.out.print(ch);
//            for(int j=65;j<=68;j++){
//                System.out.print((char) j);
//            }
           // for(int j=1;j<=i;j++){
//                char ch=(char)(j+64);
//                System.out.print(ch);
//                System.out.print(i);

            for(int  j=1;j<=i;j++)
            {
                if(i % 2 ==0 )
                {

                        char ch=(char)('A'+j-1);
                        System.out.print(ch);
                    }

                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }
}
