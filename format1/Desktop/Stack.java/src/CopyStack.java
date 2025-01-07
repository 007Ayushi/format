import java.util.Stack;
public class CopyStack {
    public static void main(String[] args) {

        Stack<Integer>  st_original=new Stack<>();
        st_original.push(10);
        st_original.push(20);
        st_original.push(30);
        st_original.push(40);
        System.out.println("original stack"+st_original);

        Stack<Integer> st_reversed=new Stack<>();
        while(!st_original.isEmpty()){
            int element=st_original.pop();
            st_reversed.push(element);
        }
        Stack<Integer> st_copy=new Stack<>();
       while(!st_reversed.isEmpty()){
           int ele=st_reversed.pop();
           st_copy.push(ele);
       }
        System.out.println("copied stack"+st_copy);

    }
}
