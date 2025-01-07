package QuestionsLinkedList.java;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}


public class Insertionsll {


    public  static void Middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp=head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.val);
        temp=head;
        while(temp.next!=slow){
            temp=temp.next;
        }
        temp.next=temp.next.next;

    }
    public  static void leftMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next .next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);

    }
   public static void print(ListNode head) {
       ListNode temp =  head;
       while (temp != null) {
           System.out.print(temp.val + " ");
           temp = temp.next;
       }
       System.out.println();
   }




    public static void main(String[] args) {
        ListNode a=new ListNode(100);
        ListNode b=new ListNode(200);
        ListNode c=new ListNode(300);
        ListNode d=new ListNode(400);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        //System.out.println(a.val);
        print(a);
        Middle(a);
       print(a);
        leftMiddle(a);
        print(a);


    }

}
