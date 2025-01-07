import java.util.Stack;

public class infix_brackets {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ascii - 48);
            } else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                //work
                while (op.peek() != '(') {
                    int v1 = val.pop();
                    int v2 = val.pop();
                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                }
                op.pop();//'(' hata diye
            }
           else{
                 if(ch=='+' || ch=='-'){
                     //work
                     int v1=val.pop();
                     int v2=val.pop();
                     if(op.peek()=='-')val.push(v1-v2);
                     if(op.peek()=='+')val.push(v1+v2);
                     if(op.peek()=='*')val.push(v1*v2);
                     if(op.peek()=='/')val.push(v1/v2);
                     op.pop();
                     //push
                     op.push(ch);
                 }
            }
           if(ch =='*' || ch=='/'){
               if(op.peek()=='*' || op.peek()=='/'){
               }
           }


        }
    }
}
