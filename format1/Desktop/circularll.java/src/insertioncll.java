class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class cll{
    Node head;
    Node tail;
    int size;

    void insertAtHead(int val){
        Node temp=new Node(val);
        if(size == 0){
            head=tail=temp;
            temp.next = head;
        }

      else{
            Node t=head;
            while(t.next!=head){
                t=t.next;
            }
          temp.next=head;
          head=temp;
          t.next=head;
        }
      size++;
    }
    void InsertAtTail(int val){
        Node temp=new Node(val);
        Node t=head;
        while(t.next!=head){
            t=t.next;
        }
        t.next=temp;
        temp.next=head;
        size++;
    }
   void InsertAtAnyIndex(int index,int val)throws Error{
        if(index==0)insertAtHead(10);
        if(index==size)InsertAtTail(90);
        if(index <0 || index>size){
            throw new Error("invalid index");
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=1;i<=index-1;i++){
           x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    void deleteHead(){
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
        size--;
    }
    void deleteAtTail(){
        Node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
        size--;
    }
    void display(){
        Node temp=head;
        while(true){
            System.out.print(temp.val+" ");
            if(temp.next==head)break;
            temp=temp.next;
        }
    }
    void deleteAtAnyIndex(int index)throws Error{
        if(index ==0 )deleteHead();
        if(index==size)deleteAtTail();
        if(index<0 && index>size){
            throw new Error("invalid index");
        }
        Node temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    void size(){
        System.out.print("size:"+size);
    }
}
public class insertioncll {
    public static void main(String[] args) {
        cll list=new cll();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.InsertAtTail(100);
        list.InsertAtTail(200);
        list.InsertAtAnyIndex(2,15);
        list.display();
        System.out.println();
        System.out.println("size:  "+list.size);
        list.deleteHead();
        list.display();
        System.out.println();
        System.out.println("size :" + list.size);
        list.deleteAtTail();
        list.display();
        System.out.println();
        System.out.print("size "+list.size);
        System.out.println();
        list.deleteAtAnyIndex(3);
        list.display();
    }
}
