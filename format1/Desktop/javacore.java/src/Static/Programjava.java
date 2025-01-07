package Static;

public class Programjava {
    static int age;
    static {
        age=10;
        System.out.println("static block");
    }
    public  static void  program(){
        System.out.println("static program");
    }
     {
        System.out.println("non static block is here");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        program();
    }
}
