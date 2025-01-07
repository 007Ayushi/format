import java.util.Stack;

public class sp1 {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        System.out.println("original stack");
        System.out.println(st1);
        DisplayReverse(st1);
        pushAtBottom(st1);
       pushAtAnyIndex(st1);

        Stack<Integer> revst=new Stack<>();
        reverse(st1,revst);
        copyStack(st1,revst);


    }
    //reverse a stack
    public static void reverse(Stack<Integer> st1,Stack<Integer>revst){
        System.out.println("reversed stack");
        while(!st1.isEmpty()){
            revst.push(st1.pop());
        }
        System.out.println(revst);
    }

   public static void copyStack(Stack<Integer> st1,Stack<Integer> revst){
       System.out.println("copied stack");
       Stack<Integer>  cpstack=new Stack<>();
       while(!revst.isEmpty()){
           cpstack.push(revst.pop());
       }
       System.out.println(cpstack);
   }
   public static void pushAtBottom(Stack<Integer> st1){
       System.out.println("pushing element at bottom");
       Stack<Integer> storest=new Stack<>();

        while(!st1.isEmpty()){
           storest.push(st1.pop());
        }
        int element=100;
        st1.push(element);

       while(!storest.isEmpty()){
           st1.push(storest.pop());
       }
       System.out.println(st1);
   }
   public static void pushAtAnyIndex(Stack<Integer> st1){
       System.out.println("pushing stack at any index");
        Stack<Integer> st3=new Stack<>();
        int index=2;
        while(st1.size()>=index){
            st3.push(st1.pop());
        }
        int element=90;
        st1.push(element);
        while(!st3.isEmpty()){
            st1.push(st3.pop());
        }
       System.out.println(st1);
   }
   public static void DisplayReverse(Stack<Integer> st1){
       System.out.println("displaying stack recusively");
        if(st1.isEmpty()){
            return;
        }
        int top=st1.pop();
       System.out.println(top);
       DisplayReverse(st1);
       st1.push(top);
   }

}
