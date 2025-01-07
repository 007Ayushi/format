import java.sql.PreparedStatement;

public class MethodOverloading {
    public int add(int n1,int n2){
        int res=n1+n2;
        return res;
    }
    public int add(int n1,int n2,int n3){
        int result=n1+n2+n3;
        return result;
    }
    public double add(double a,double b){
        double result1=a+b;
        return result1;
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        System.out.println(obj.add(1,2));
        System.out.println( obj.add(1,2,3));
        System.out.println(obj.add(100,200));
    }
}
