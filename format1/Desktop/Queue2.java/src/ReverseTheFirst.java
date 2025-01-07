import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseTheFirst {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter k : no. of elements u want to reverse");
        int k=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        Queue<Integer> qt=new LinkedList<>();
        while (!st.isEmpty()){
            qt.add(st.pop());
        }
        while (!q.isEmpty()){
            qt.add(q.remove());
        }

        System.out.println(qt);
    }
}
