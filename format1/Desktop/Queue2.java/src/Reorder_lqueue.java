import java.awt.desktop.QuitEvent;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reorder_lqueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        int n=q.size();
        for (int i=1;i<=n/2;i++){
            st.push(q.remove());
        }

        System.out.println(q);
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        while (q.size()>4){
            st.push(q.remove());
        }
        System.out.println(q);
        System.out.println(st);

        while (!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
        System.out.println(q);

        while (!q.isEmpty()){
            st.push(q.remove());
        }
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);

    }
}
