import java.util.Scanner;
public class star1 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<(n+1);j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
