package QuestionsLinkedList.java;
//
//import java.sql.ClientInfoStatus;
//
//class Node{
//    Node next;
//    int val;
//    Node(int val){
//        this.val=val;
//    }
//}
//class linkedquestion {
//    Node tail;
//    Node head;
//    int size;
//
//    void insertAtFirst(int val) {
//        Node temp=new Node(val);
//        if (head == null) {
//            head=tail=temp;
//        }
//       else{
//            temp.next = head;
//            head = temp;
//        }
//        size+=1;
//    }
//    void insertAtEnd(int val){
//        Node temp=new Node(val);
//        if(head==null){
//            head=tail=temp;
//        }
//        else{
//            tail.next=temp;
//            tail=temp;
//        }
//        size+=1;
//    }
//    void insertAtGivenIndex(int val,int index){
//        Node temp=new Node(val);
//        Node x=head;
//        if(index==0)insertAtFirst(val);
//        if(index==size)insertAtEnd(val);
//        if(index>size || index<0){
//            System.out.println("list size is not sufficient");
//        }
//        else{
//
//            for(int i=1;i<=index;i++){
//                x=x.next;
//            }
//            temp.next=x.next;
//            x.next=temp;
//            size++;
//        }
//
//    }
//
//
//
//    void print() {
//        Node temp=head;
//        while (temp != null) {
//            System.out.print(temp.val+" ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//    void size(){
//        System.out.println("size of a linked list is  "+ size);
//    }
//}
//
//
//public class LinkedlisHomework {
//    public static  void main(String[] args) {
//      linkedquestion  list =new linkedquestion();
//        list.insertAtFirst(200);
//        list.insertAtFirst(100);
//      list.insertAtEnd(300);
//      list.insertAtEnd(400);
//list.print();
//
//        list.insertAtGivenIndex(800,2);
//        list.print();
//        list.size();
//
//    }
//
//    }
//
//
//class Node{
//    int value;
//    Node next;
//    Node(int value){
//        this.value=value;
//    }
//    class ll{
//        Node temp;
//        Node head;
//        Node next;
//        Node tail;
//        void insertAtBeg(int value){
//            Node temp=new Node(value);
//            if(head==null)head=tail=null;
//            temp.next=head.next;
//            head=temp;
//
//        }
//        void print(){
//            while(temp!=null){
//
//                temp=temp.next;
//            }
//        }
//    }
//
//    class LinkedlistHomework{
//        public void main(String[] args) {
//            ll list=new ll();
//            list.insertAtBeg(10);
//            list.insertAtBeg(20);
//            list.print();
//
//        }
//    }
//
//}
