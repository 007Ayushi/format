public class queuell {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        public static class linkedlistq {
            Node head = null;
            Node tail = null;
            int size = 0;

            public void add(int x) {
                Node temp = new Node(x);
                if (size == 0) head = tail = temp;
                else{
                    tail.next=temp;
                    tail=temp;
                }
                size++;
            }

            int remove() {
                if (size == 0) {
                    System.out.println("queue is full");
                    return -1;
                }
                int x = head.val;
                head = head.next;
                size--;
                return x;
            }

            int peek() {
                if (size == 0) {
                    System.out.println("queue is empty");
                    return -1;
                }
                return head.val;
            }

            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.println(temp.val);
                    temp = temp.next;
                }

            }

            public boolean isEmpty() {
                if (size == 0) return true;
                return false;
            }
        }


        public static void main(String[] args) {
               linkedlistq q=new linkedlistq();
               q.add(10);
               q.add(20);
               q.add(30);
               q.display();
               q.remove();
               q.display();
            System.out.println("peeked element is"+q.peek());
        }

    }
}
