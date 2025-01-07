import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class reversetheQueue{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        System.out.println(st);
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}