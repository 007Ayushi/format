import java.util.LinkedList;
import java.util.Queue;

public class remove_evenindex {
    static Queue<Integer>q2;
    static Queue<Integer>q3;
     public static void remove(){
        for(int i=0;i<=q2.size();i++){
            if(i%2!=0) {
                q3.add(q2.remove());

            }
               else{
                q2.remove();
            }
            }
         System.out.println(q3);
    }

    public static void main(String[] args) {
        q2=new LinkedList<>();
        q2.add(10);
        q2.add(20);
        q2.add(30);
        q2.add(40);
        remove();
    }
}
