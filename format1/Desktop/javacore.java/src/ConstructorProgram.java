public class ConstructorProgram {
    private String name;
    private int age;

    ConstructorProgram(String name,int age){
        this.name=name;
        this.age=age;
    }
   public String getName(){
       return name;
    }
    public int getAge(){
        return age;

    }

    public static void main(String[] args) {
        ConstructorProgram obj=new ConstructorProgram("ayushi...",20);
        System.out.println( obj.getName());
        System.out.println(  obj.getAge());
    }
}
