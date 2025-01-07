import java.util.Stack;

public class PushElementAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st_original=new Stack<>();
        st_original.push(5);
        st_original.push(10);
        st_original.push(15);
        st_original.push(20);

        System.out.println(st_original);

        Stack<Integer> st_temp=new Stack<>();
        while(!st_original.isEmpty()){
            st_temp.push(st_original.pop());
        }
        System.out.println(st_temp);
        int element=50;
        st_original.push(element);
        while(!st_temp.isEmpty()){
            st_original.push(st_temp.pop());
        }
        System.out.println(st_original);
    }
}
