import java.util.Stack;

public class ImplementationLinked_list {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static class Stack{
            Node head=null;
            int x;
            int size=0;
            void push(int x){
                Node temp=new Node(x);
                temp.next=head;
                head=temp;
                size++;
            }
            int pop(){
                if(head==null){
                    System.out.println("stack is empty");
                    return -1;
                }
                int t=head.val;
                head=head.next;
                size--;
                return t;
            }
            void size(){
                System.out.println("size of stack is"+size);
            }
            int peek(){
                if(head==null){
                    System.out.println("stack is empty");
                }
                int g= head.val;
                return g;
            }
            boolean isEmpty(){
                if(size==0){
                    return true;
                }
                return false;
            }
            void display(){
               displayREC(head);
                }
                void displayREC(Node h){
                if(h==null){
                    return;
                }
                displayREC(h.next);
                System.out.println(h.val);
            }
    }


    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        st.pop();
        st.display();
         st.peek();
    }
}
