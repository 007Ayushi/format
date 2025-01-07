//package linkedlist;
class Node//node class
{
    int val;
    Node next;
    Node temp;
    Node(int val){//parameterised constructor
        this.val=val;
    }
}
public class ListNodeClass {
//  public static void print(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }

    public static void main(String[] args) {
        //simple creation of single linked list
        Node a = new Node(10);//linkedlist.Node@6acbcfc0
        System.out.println(a);
        System.out.println(a.val);//10
        System.out.println(a.next);//null
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        System.out.println(b);//Node@5f184fc6 this address may vary after compilation
        //linking one node to another node
        a.next = b;
        System.out.println(b);
        System.out.println(b.val);
        System.out.println(a.next.val);
        System.out.println(a.next);
        b.next = c;
        c.next = d;
        System.out.println(a.next.next.val);//c
        System.out.println(a.next.next.next.val);//d
        // print(a);
        System.out.println("recursively printing");
        recursivedisplay(a);
        System.out.println("pw recursion");
        pwrecursion(a);
    }
    //traversing a node with the help of temp;
//       Node temp=head;
//       while(temp!=null)
//    {
//        System.out.println(temp.val);
//        temp = temp.next;
//    }

    //displaying a linked list recursively
    public static void recursivedisplay(Node head) {
//        Node temp = head;
//        if (temp== null) {
//            //System.out.print(temp.val);
//            return;
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.val);
            temp = temp.next;
        }
//        }
//        System.out.println(temp.val);
//         recursivedisplay(temp.next);
    }
    public static void pwrecursion(Node head){
        if(head==null)return;
        System.out.println(head.val);
        pwrecursion(head.next);

    }

}



