import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
//        System.out.println(st);
//        System.out.println(   st.pop());
//        System.out.println(st);
//        System.out.println(st.isEmpty());
//        while(st.size()>1){
//            st.pop();
//        }
//        System.out.println(st.peek());
//    }

        Stack<Integer> st1=new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        System.out.println(st1);
        Stack<Integer> st2=new Stack<>();
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        System.out.println(st2);

        while(!st2.isEmpty()){
            System.out.println(st2.pop());
        }

        Stack<Integer> stb=new Stack<>();
        stb.push(100);
        stb.push(200);
        stb.push(300);
        stb.push(400);
        stb.push(500);
        System.out.println(stb);
        Stack<Integer> stc=new Stack<>();
        while(!stb.isEmpty()){
           stc.push( stb.pop());
        }
        stb.push(600);
        while(!stc.isEmpty()){
            stb.push(stc.pop());
        }
        System.out.println(stb);

        //INSERT AT A PARTICULAR INDEX
        Stack<Integer> stindex =new Stack<>();
        int index=2;
       while(stb.size()>=index){
            stindex.push(stb.pop());
        }
        stb.push(1000);
        while(!stindex.isEmpty()){
            stb.push(stindex.pop());
        }
        System.out.println(stb);

        displayReverse(stb);

    }
    public static void displayReverse(Stack<Integer> stb){
        if(stb.isEmpty()){
            return;
        }
        int top=stb.pop();
        System.out.println(top);
        displayReverse(stb);
        stb.push(top);

        System.out.println("reverse stack using recursion");
        System.out.println(stb);
    }

}
