import java.util.Scanner;

public class All_Programs {
    public static int fact(int n){
        if(n==1 || n==0)return n;
        return n*fact(n-1);
    }
    public static void printnto1(int n){
        if(n==0)return;
        System.out.print(n+" ");
        printnto1(n-1);
    }
    public static void print1ton(int n,int m){
        if(m>n)return;
        System.out.print(m+" ");
        print1ton(n,m+1);
    }
  static int r=5;//global variable
    public static void print1ton2(int x){
        if(x>r)return;
        System.out.print(x+" ");
        print1ton2(x+1);
    }
    public static void printrecursion(int n){
        if(n==0)return;
        printrecursion(n-1);
        System.out.print(n+" ");
    }
    public static void sum1ton(int x,int n){
        if(n==0){
            System.out.println(x);
            return;
        }
        sum1ton(x+n,n-1);
    }
    public static int sum1ton2(int n){
        if(n==1 || n==0)return n;
        return  n+sum1ton2(n-1);
    }
    public static int pow(int a,int b){
       if(b==0)return 1;
       return a*pow(a,b-1);
    }
    public static int pow2(int a,int b){
        if(b==0)return 1;
        int ans=pow(a,b/2);
        if(b%2==0)return ans*ans;
        else return ans*ans*a;
    }
    public static  void skipchar(int i,String str,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(i)=='A' || str.charAt(i)=='a'){
            skipchar(i+1,str,ans);
        }
       else{
            ans+=str.charAt(i);
            skipchar(i+1,str,ans);
        }
    }
  public static void print(int m,int n){
        if(m==n+1){
            return;
        }
      System.out.println(m);
       print(m+1,n);
  }
  public static void printing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
      System.out.println(n);
     printing(n-1);

  }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
        System.out.println("printing all the numbers from n to 1");
        printnto1(n);
        System.out.println();
        System.out.println("printing number from 1 to n");
        print1ton(n,1);
        print1ton2(1);
        System.out.println("printing all the numbers from 1 to n recursively");
        printrecursion(5);
        System.out.println();
        System.out.println("sum of numbers");
        sum1ton(0,5);
        int y=sum1ton2(4);
        System.out.println(y);
        int power=pow(2,4);
        System.out.println(power);
        int powerofnum=pow2(2,5);
        System.out.println(powerofnum);
        skipchar(0,"ayushi","");
        print(1,4);
      printing(10);



    }

}
