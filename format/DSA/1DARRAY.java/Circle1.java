abstract public class Shape {
   public abstract void calarea();
   protected  abstract  void print();
    
}
public class Circle1 extends Shape
{
    private String shapeType;
    private double area;
    public double radius;
    public  void calarea()
    {
         System.out.println("area of a circle is"+ Math.PI*radius*radius);
    }
}
public class rectangle Shape
{
    public void rec()
    {
    private int length;
    private int breadth;
    System.out.println(length*breadth);
    
}
}
public class Circle
{
public static void main()
{
    Circle1 ob=new Circle1();
    ob.calarea();
    rectangle ob2=new rectangle();
    ob2.rec();
    
    
    
}
}
