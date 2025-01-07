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
    int size;

    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insertionAtEnd(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
        void size(){
            System.out.println("length of linked list is "+size);
        }


    void insertAtAnyIndex(int val,int index){
        if(index==0){
            insertAtHead(val);
            return;
        }
        if(index==size){
            insertionAtEnd(val);
            return;
        }
        if(index>size || index<0){
            System.out.println("invalid index");
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
    int get(int index){
        if(index==size-1)return tail.val;
        if(index>size || index<0){
            System.out.println("error has come");
        }
        Node temp=head;
        for(int i=1;i<=index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void set(int index,int val){
        if(index==size-1){
            tail.val=val;
        }
        if(index<0 || index>size){
            System.out.println("invalid index");
        }
        Node temp=head;
        for(int i=1;i<=index;i++){
            temp=temp.next;
        }
        temp.val=val;
    }
    void deleteAtFirst()throws Error
    {
        if(head==null)throw new Error("list is empty");
        else{
            head=head.next;
        }
        size--;
    }
    void deletion(int index)throws Error{
        if(index==0){
            deleteAtFirst();
            return;
        }
        if(index<0 || index>=size){
            throw new Error("invalid index");
        }
        Node temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail)tail=temp;
        temp.next=temp.next.next;
        size--;
    }
}
public class SlllList {
    public static void main(String[] args) {
        sll list=new sll();
        list.insertAtHead(200);
        list.insertAtHead(100);
        list.insertionAtEnd(300);
        //list.print();
        list.size();
        //list.print();
        //list.insertAtHead(400);
        //list.insertionAtEnd(500);
        list.insertAtAnyIndex(11200,3);
        list.size();
        list.print();
        System.out.println(list.get(2));

        list.set(3,1000);
        list.print();
        //list.deleteAtFirst();
        list.deletion(2);
        list.print();

    }
}
