public class Recursions {
    public static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    public static void print(int n) {
        if (n == 0) return;
        System.out.println(n);
        print(n - 1);

    }

    public static void print1ton(int x, int n) {
        if (x > n) return;
        System.out.println(x);//work
        print1ton(x + 1, n);//call
    }

    public static void printinc1ton(int n) {
        if (n == 0) return;
        printinc1ton(n - 1);
        System.out.println(n);
    }

    public static void sum(int n, int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        sum(n - 1, s + n);
    }

    public static int sum1ton(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int s = n + sum1ton(n - 1);
        return s;
    }

    public static int pow(int a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }

    public static int logpow(int a, int b) {
        if (b == 0) return 1;
        int ans = logpow(a, b / 2);
        if (b % 2 == 0) return ans * ans;
        else return ans * ans * a;
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) return n;
        int f = fibo(n - 1) + fibo(n - 2);
        return f;
    }

    public static int stairpath(int n) {
        if (n <= 2) return n;
        int res = stairpath(n - 1) + stairpath(n - 2);
        return res;
    }

    public static int stairpath1to3(int n) {
        if (n <= 2) return 1;
        if (n == 3) return 2;
        return stairpath1to3(n - 1) + stairpath1to3(n - 3);
    }

    public static int mazepath(int row, int col, int m, int n) {
        if (row == m || col == n) return 1;
        int rightways = mazepath(row, col + 1, m, n);
        int downways = mazepath(row + 1, col, m, n);
        return rightways + downways;

    }

    public static int mazepath2(int row, int col, int m, int n) {
        if (row == 1 || col == 1) return 1;
        int rightways = mazepath2(row, col - 1, m, n);
        int downways = mazepath2(row - 1, col, m, n);
        return rightways + downways;
    }

    public static void pip(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        pip(n - 1);
        System.out.print(n + " ");
        pip(n - 1);
        System.out.print(n + " ");
        System.out.println();
    }


    public static void print(int[] arr, int i) {
        if (i == arr.length) return;
        System.out.println(arr[i]);
        print(arr, i + 1);
    }

    public static void printstring(String str, int i) {
        if (i == str.length()) return;
        System.out.println(str.charAt(i));
        printstring(str, i + 1);
    }

    public static void skipcharacter(String str, String st, int i) {
        if (i == str.length()) {
            System.out.println(st);
            return;
        }
        if (str.charAt(i) == 'a') {
            skipcharacter(str, st, i + 1);
        } else {
            st += str.charAt(i);
            skipcharacter(str, st, i + 1);
        }
    }

    public static void subsets(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        subsets(s, ans, i + 1);
        subsets(s, ans + s.charAt(i), i + 1);
    }

    public static void print(String ans, String s) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i + 1);
            print(ans + ch, left + right);
        }
    }
    public static int hcf(int a,int b){
        for(int i=Math.min(a,b);i>0;i--){
           if(a%i==0 && b%i==0){
               return  i;
           }
        }
        return 1;
    }
    public static int rechcf(int a,int b){
        if(b%a==0)return a;
        return rechcf(b%a,a);
    }
    public static void  genratenotconsecutive1s(String s,int n){
        int m=s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
           genratenotconsecutive1s(s+0,n);
          genratenotconsecutive1s(s+1,n);
        }
        else genratenotconsecutive1s(s+0,n);
    }
    public static String CountAndSay(int n){
        if(n==1)return "1";
        String s=CountAndSay(n-1)+"@";
        String ans="";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j))j++;
            else{
                int len=j-i;
                ans+=len;
                ans+=s.charAt(i);
                i=j;
            }
        }
        return ans;
    }
    public static void generateParenthesis(int open,int close,String ans,int n){
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
       if(open<n)generateParenthesis(open+1,close,ans+"(",n);
       if(close<open)generateParenthesis(open,close+1,ans+")",n);
    }
    //output:((()))
    //(()())
    //(())()
    //()(())
    //()()()3

    public static void sumOdd(int s,int a,int b){
      if(b<a){
          System.out.println(s);
          return;
      }
      if(b%2!=0){
          sumOdd(s+b,a,b-1);
      }
     else{
          sumOdd(s,a,b-1);
     }
    }
    public static int stairPath1(int n){
        if(n==1 || n==2){
            return n;
        }
        if(n==3){
            return 4;
        }
        return stairPath1(n-1)+stairPath1(n-2)+stairPath1(n-3);
    }
    public static boolean perfectSquare(int n){
//        for(int i=1;i<n;i++){
//            if(n%i==0){
//                if(i*i==n){
//                   return true;
//                }
//            }
        if(n<1){
            return false;
        }
        int sqrt=(int)Math.sqrt(n);
       return((sqrt*sqrt==n));
    }
    public static boolean powerOf2(int n){
        if(n<=0){
            return  false;
        }
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return powerOf2(n/2);
    }
    public static void ArrayInReverse(int []arr1,int i){

        if(i<0)return;
        System.out.println(arr1[i]);
        ArrayInReverse(arr1,i-1);

    }

    public static void main(String[] args) {
        int factorial = fact(5);
        System.out.println(factorial);
        print(5);
        print1ton(10, 20);
        printinc1ton(4);
        sum(5, 0);
        int s = sum1ton(5);
        System.out.println("sum of numbers fro  1 to n is" + s);
        int power = pow(2, 4);
        System.out.println("power of and b is " + power);
        int powerofaandb = logpow(3, 4);
        System.out.println("power of and b" + powerofaandb);
        int fibonacci = fibo(6);
        System.out.println("fibonacci of a number is" + fibonacci);
        int answer = stairpath(5);
        System.out.println(answer);
        int ans = stairpath1to3(5);
        System.out.println(ans);
        System.out.println(answer);
        int an = stairpath1to3(5);
        System.out.println(an);
        int mp = mazepath(1, 1, 3, 3);
        System.out.println(mp);
        int mp2 = mazepath2(3, 3, 1, 1);
        System.out.println(mp2);
        pip(3);
        int[] arr = {10, 20, 30, 40, 50};
        print(arr, 0);
        String str = "ayushiauhs";
        printstring(str, 0);
        String st = "";
        skipcharacter(str, st, 0);
        subsets("abcd", "", 0);
        print("","abc");
        int hcfofnum=hcf(24,60);
        System.out.println(hcfofnum);
        int recursive_hcf=rechcf(24,60);
        System.out.println(recursive_hcf);
       genratenotconsecutive1s("",3);
      String cs= CountAndSay(3);
        System.out.println(cs);
        generateParenthesis(0,0,"",3);
         sumOdd(0,3,7);
         int stairs=stairPath1(5);
        System.out.println(stairs);
        boolean p=perfectSquare(25);
        System.out.println(p);
        boolean powerof2=powerOf2(16);
        System.out.println("checks power of 2"+powerof2);
        int []arr1={10,20,30,40,50,60};
        ArrayInReverse(arr1,arr1.length-1);
    }
}
