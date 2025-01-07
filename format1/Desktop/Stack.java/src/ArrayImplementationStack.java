import java.util.Stack;

public class ArrayImplementationStack {
    public static class Stack {
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
            }
            else{
                return arr[idx-1];
            }
            return -1;
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        st.display();
    }
}
