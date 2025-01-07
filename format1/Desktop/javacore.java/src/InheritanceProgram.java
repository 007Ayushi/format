class animal
{
    public void sleep(){
        System.out.println("sleep method");
    }
}
class deer extends animal{

}
class dog extends animal{

}
class cat extends animal{

}
//specialised method
class aditi extends deer{
    public void aditigupta(){
        System.out.println("aditi is such a clever girl.");
    }

}

public class InheritanceProgram {
    public static void main(String[] args) {
        deer ob=new deer();
        ob.sleep();
        aditi ob1=new aditi();
        ob1.sleep();
        ob1.aditigupta();

    }

}
