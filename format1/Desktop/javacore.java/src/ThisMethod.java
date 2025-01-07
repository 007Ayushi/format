public class ThisMethod {
    private String name;
    private int age;

//    public ThisMethod(){
//        this("aaa",10);
//        System.out.println("default constructor here");
//    }
    public ThisMethod(String name){
//        this();
        this.name=name;
        age=20;
    }
    public ThisMethod(int age){
        this("ayushi gupta");
        this.age=age;
    }
    public ThisMethod(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void disp(){

        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        ThisMethod obj=new ThisMethod(200);
        obj.disp();
//       ThisMethod obj1=new ThisMethod("ayushi");
//       obj.disp();
    }
}
