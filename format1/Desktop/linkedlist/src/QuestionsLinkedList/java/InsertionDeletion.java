package QuestionsLinkedList.java;
class  Node{
    Node next;
    int val;
    Node(int val){
        this.val=val;
    }
}

class sll{
    Node head;
    Node tail;
    Node temp;
    int size;
    void insertion(int val){
        Node temp=new Node(val);
        if(head==null)tail=head=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insertionAtEnd(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp;
        while(temp!=tail){
            tail.next=temp;
            tail=temp;
        }
        size++;

    }
    void insertAtAnyIndex(int val,int index){

        if(index<0 || index>size) {
            System.out.println("list is out");
        }
        if(index==0) {
            insertion(val);
        }
        if(index==size){
            insertionAtEnd(val);
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=1;i<=index-1;i++) {
            x = x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    void deleteAtFirst()throws Exception{
        if(head==null)throw new Exception("list is empty");
        else{
            head=head.next;
        }
        size--;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void deleteAtLast(int index)throws Exception {
        if (index == 0) {
            deleteAtFirst();
        }
        if (index < 0 || index >= size) {
            throw new Error("invalid index");
        }
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        if(temp.next==tail)tail=temp;
        temp.next=temp.next.next;
        size--;
    }


}
public class InsertionDeletion  {
    public static void main(String[] args)throws Exception {
        sll list=new sll();
        list.insertion(100);
        list.insertion(200);
        list.insertion(300);
        list.insertion(400);
        list.insertionAtEnd(500);
        list.insertionAtEnd(600);
        list.insertionAtEnd(700);
        list.insertAtAnyIndex(1000,1);
        list.insertAtAnyIndex(2000,4);
        list.deleteAtFirst();
        list.print();
        list.deleteAtLast(7);
        list.print();

    }
}
