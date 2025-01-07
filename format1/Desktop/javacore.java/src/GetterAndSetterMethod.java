public class GetterAndSetterMethod {
    private int age;
    private String  name;

   public int getAge(){
       return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
       return name;
    }
    public void SetName(String name){
       this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        GetterAndSetterMethod obj=new GetterAndSetterMethod();
        obj.setAge(20);
        System.out.println(obj.getAge());
        obj.SetName("ayushi gupta");
        String studobj=obj.getName();
        System.out.println(studobj);

    }


}
