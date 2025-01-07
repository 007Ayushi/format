class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }

}
class sll{
    Node head;
    Node tail;
    Node temp;
    int size;
    public void InsertAtHead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{

            temp.next=head;
            head=temp;
        }
        size+=1;
    }
    public void InsertAtTail(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size+=1;
    }
    void InsertAtAnyIndex(int idx,int val)throws Error{
        Node temp=new Node(val);
        if(idx==0){
            InsertAtHead(val);
        }
        if(idx<0 || idx==size-1){
            throw new Error("error");
        }
        else{
            Node x=head;
            for(int i=1;i<=idx-1;i++){
                x=x.next;
            }
            temp.next=x.next;
            x.next=temp;
        }
        size+=1;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    void deleteAtHead()throws Error{
        Node temp=head;
        if(head==null){
            throw new Error("error");
        }
        else{
            head=head.next;
            size--;
        }
    }
    void deleteAtAnyIndex(int idx)throws Error{
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx<0 || idx>=size){
            throw new Error("error");
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    int get(int idx)throws Error{
        if(idx==size-1){
            return tail.val;
        }
        if(idx >=size-1 || idx<0){
            throw new Error("error");
        }
        else{
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.val;
        }
    }
    void setValue(int idx,int val)throws Error{
        if(idx==size-1)tail.val=val;
        if(idx <0 || idx>=size){
            throw new Error("ERROR");
        }
        Node x=head;
        for(int i=1;i<=idx;i++){
            x=x.next;
        }
        x.val=val;

    }
}
public class LinkedListImplementation {
    public static void main(String[] args) {
        sll list=new sll();
        list.InsertAtHead(10);
        list.InsertAtHead(20);
        list.InsertAtHead(30);
        list.InsertAtTail(50);
        list.InsertAtAnyIndex(2,100);
        list.deleteAtHead();
        list.deleteAtAnyIndex(2);
        //list.display();
       // System.out.println(list.get(2));
        list.setValue(2,200);
        //list.display();
        list.InsertAtTail(500);
        list.display();


    }
}
