import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer>q1=new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
      while(!q.isEmpty()){
          System.out.println(q.peek());
          q1.add(q.remove());
      }
        System.out.println(q1);

    }

}
