package linkedlist;
//class Node{
//    Node next;
//    int value;
//    Node(int value){
//        value=this.value;
//    }

}
class sll1 {
    Node head;
    void insertAtFirst(int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
    }
    void print(){
       Node temp=head;
       while(temp!=null){
           System.out.println(temp.value);
           temp=temp.next;
       }
    }
}

public class PS3 {
    public static void main(String[] args) {
       sll1 list=new sll1();
       list.insertAtFirst(1);
       list.print();
    }
}
