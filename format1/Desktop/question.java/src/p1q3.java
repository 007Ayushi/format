
class Node{
    Node next;
    int value;
    Node(int value){
        this.value=value;
    }

}
class sll1 {
    Node head;
    Node t;
    int size;
    void insertAtFirst(int val){
        Node temp=new Node(val);
        if(head==null)head=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insertAtLast(int val){
        Node t=new Node(val);
        Node temp=head;
        if(head==null)temp=head;
        while(temp.next!=null){
           temp=temp.next;
        }
        temp.next=t;
        t.next=null;
        size++;
    }
    void insertAtAnyIndex(int value,int index){
        Node temp=head;
        Node tt=new Node(value);
        if(index==0)insertAtFirst(value);
        if(index<0 || index>size){
            System.out.println("list is empty");
        }
        if(index==size)insertAtLast(value);
        else{
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            tt.next=temp.next;
            temp.next=tt;
            size++;

        }

    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
        System.out.println();
    }
    void deleteAtFirst(){
        head=head.next;
        size--;

    }
    void deletAtAnyNode(int index){
        if(index==0)deleteAtFirst();
        if(index<0 || index>=size){
            System.out.println("couldnt dlt");
        }
        Node temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    void size(){
        System.out.println("size of a linked list is"+size);

    }
}

public class p1q3 {
    public static void main(String[] args) {
        sll1 list=new sll1();
        list.insertAtFirst(200);
        list.insertAtFirst(100);
        list.insertAtLast(300);
        list.insertAtAnyIndex(400,2);
       // list.print();
        list.deleteAtFirst();
        list.print();
        list.deletAtAnyNode(1);
        list.print();
        list.size();
    }
}
