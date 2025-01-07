public class StaticBlockNonStaticBlock {
    static int age;
    int m,n;
    static int a,b;

   static {
       a=100;
       b=200;
       System.out.println("static block ");
    }
    {
         m=10;
         n=20;
        System.out.println("a"+a+"b"+b);
        System.out.println("ayushi is there");
    }
    static void display(){
        System.out.println("static block executed"+  age);
    }
    public void disp(){
        System.out.println("non static methods");
    }

    public static void main(String[] args) {
        StaticBlockNonStaticBlock obj=new StaticBlockNonStaticBlock();
        display();
        obj.disp();
    }
}
