import java.util.Scanner;
public class StairPath {
    public static int paths(int n){
        if(n<=2)return n;
        return paths(n-1)+paths(n-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(paths(n));


    }

}
