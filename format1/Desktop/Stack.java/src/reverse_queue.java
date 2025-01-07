import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        System.out.println(st);
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.print("reversed queue:"+" ");
        System.out.println(q);
    }
}
