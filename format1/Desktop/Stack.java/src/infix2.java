import java.util.Stack;

public class infix2 {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> value = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) value.push(ascii - 48);
            else if (op.size() == 0) op.push(ch);
            else {
                if (ch == '+' || ch == '-') {
                    int v2 = value.pop();
                    int v1 = value.pop();
                    if (op.peek() == '-') value.push(v1 - v2);
                    if (op.peek() == '+') value.push(v1 + v2);
                    if (op.peek() == '*') value.push(v1 * v2);
                    if (op.peek() == '/') value.push(v1 / v2);
                    op.pop();
                    //push
                    op.push(ch);
                }
                if (ch == '/' || ch == '*') {
                    if (op.peek() == '/' || op.peek() == '*') {
                        int v2 = value.pop();
                        int v1 = value.pop();
                        if (op.peek() == '/') value.push(v1 / v2);
                        if (op.peek() == '*') value.push(v1 * v2);
                        op.pop();
                        //push
                        op.push(ch);

                    } else {
                        op.push(ch);

                    }
                }
            }
        }

        while (value.size() > 1) {
            int v2 = value.pop();
            int v1 = value.pop();
            if (op.peek() == '-') value.push(v1 - v2);
            if (op.peek() == '+') value.push(v1 + v2);
            if (op.peek() == '*') value.push(v1 * v2);
            if (op.peek() == '/') value.push(v1 / v2);
            op.pop();
        }
        System.out.println(value.peek());
    }
}
