import java.util.LinkedList;
import java.util.Queue;

public class printing_queue {
    static Queue<Integer>q;
    static Queue<Integer> q1;
    static void print(){
     while(!q.isEmpty()){
         System.out.println(q.peek()+" ");
         q1.add(q.remove());
     }
    }
    public static void main(String[] args) {
        q=new LinkedList<>();
        q1=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        print();
        System.out.println(q1);
    }
}
