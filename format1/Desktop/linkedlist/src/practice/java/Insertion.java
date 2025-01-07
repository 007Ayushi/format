package practice.java;



class ListNode{//ListNode class
    ListNode next;
    int val;
    ListNode(int val){
        this.val=val;
    }
}

class sll{
    ListNode head;
    ListNode tail;
    int size = 0;


    void InsertionAtFirst(int val) {
        ListNode temp = new ListNode(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertionAtEnd(int val){
        ListNode temp=new ListNode(val);
        if(head==null)head=tail=null;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void InsertAtAnyPosition(int val,int index){
        ListNode temp=new ListNode(val);
        if(index<0 && index>size){
            System.out.println("error has occured");
        }
        if(index==0)InsertionAtFirst(val);
        if(index==size)insertionAtEnd(val);
        ListNode x=head;
        for(int i=1;i<=index-1;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }

    void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }

        System.out.println();
    }
    void DeleteAtFirst(){
        if(head==null){
            System.out.println("error has arrived bcoz list is empty");
        }
        head=head.next;
        size--;
    }
    void DeleteAtlast(){
        ListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    void DeleteAtAny(int index){
        if(index==0 ){
            DeleteAtFirst();
            return;
        }
        if(index<0 || index>size){
            System.out.println("index is not approriate");
        }
        ListNode temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;

    }
    void size(){
        System.out.println("the size of a linked list is"+size);
    }
}
public class Insertion {

    public static void main(String[] args) {
        sll list=new sll();
        list.InsertionAtFirst(100);
        list.InsertionAtFirst(200);
        list.InsertionAtFirst(300);
       list.print();
        list.size();
        list.print();
        list.insertionAtEnd(1000);
        list.print();
        list.InsertAtAnyPosition(453,3);
        list.print();
        list.DeleteAtFirst();
        list.print();
        list.DeleteAtlast();
        list.print();
        list.DeleteAtAny(2);
        list.print();
    }
}