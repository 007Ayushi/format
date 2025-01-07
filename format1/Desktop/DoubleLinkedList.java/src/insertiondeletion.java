class Node{
    Node next;
    Node prev;
    int val;
    Node node;
    Node(int val){
        this.val=val;
    }
}
class dll{
    int size;
    Node head;
    void insertAthead(int val){
        Node temp=new Node(val);
        if(size==0){
            head=temp;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size--;
    }
    void insertAtTail(int val){
        Node temp=new Node(val);
        if(size==0){
            head=temp;
        }
        else{
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=temp;
            temp.prev=t;
            temp.next=null;
        }
        size--;
    }
    void insertAtAnyIndex(int index,int val){
        if(index==0){
            insertAthead(val);
            return;
        }
       if(index==size){
            insertAtTail(val);
            return;
        }
        if(index<0 || index>size){
            System.out.println("invalid index");
            return;
        }

            Node temp=new Node(val);
            Node x=head;
            for(int i=1;i<=index-1;i++){
                x=x.next;
            }
            Node y=x.next;
            x.next=temp;
            temp.prev=x;
            y.prev=temp;
            temp.next=y;
            size++;
    }
    void deleteAtHead(){
        head=head.next;
        
    }
    void deleteAtTail(){
        Node temp=head;
        if(size==0){
            head=temp;
        }
        else{
             while(temp.next.next!=null){
                 temp=temp.next;
             }
             temp.next=null;
        }
        size--;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class insertiondeletion {
    public static void main(String[] args) {
        dll list =new dll();
        list.insertAthead(10);
        list.insertAthead(20);
        list.deleteAtTail();
        list.display();
        list.insertAtTail(30);
        list.insertAtAnyIndex(0,90);
        list.display();

    }
}
