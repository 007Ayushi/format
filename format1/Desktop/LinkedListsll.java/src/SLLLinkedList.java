class ListNode{
    ListNode next;
    int value;
    ListNode(int value){
        this.value=value;
    }
}
class sll1 {
    ListNode head;
    ListNode tail;
    ListNode temp;
    int size = 0;

    void InsertAtHead(int value) {
        ListNode temp = new ListNode(value);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAtEnd(int value) {
        ListNode temp = new ListNode(value);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtAnyIndex(int index, int value) throws Error {
        if (index == 0) InsertAtHead(value);
        if (index == size) insertAtEnd(value);
        if (index > size || index < 0) throw new Error("invalid index");
        else {
            ListNode temp = new ListNode(value);
            ListNode x = head;
            for (int i = 1; i <= index - 1; i++) {
                x = x.next;
            }
            temp.next = x.next;
            x.next = temp;
        }
        size++;
    }

    void deleteAtHead() throws Error {
        if (head == null) throw new Error("list is empty");
        else
    {
        head = head.next;
    }

    size--;
}
void DeleteAtAnyIndex(int index)throws Error{
        if(index==0){
            deleteAtHead();
            return;
        }
        if(index<0 || index>=size){
            throw new Error("invalid index");
        }
       ListNode temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail)tail=temp;
        temp.next=temp.next.next;
        size--;
}
int get(int index){
    if(index==size-1){
        return tail.value;
    }
        if(index==0){
            System.out.println(head.value);
        }
        if(index>=size-1||index<0){
            System.out.println("invalid index");
        }
        ListNode temp=head;
        for(int i=1;i<=index;i++){
            temp=temp.next;
        }
   return temp.value;
}
void set(int index,int value){
        if(index==size-1){
            tail.value=value;
        }
    if(index>=size-1||index<0){
        System.out.println("invalid index");
    }
    ListNode temp=head;
    for(int i=1;i<=index-1;i++){
        temp=temp.next;
    }
    temp.value=value;

}
    void print(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("the length of a linked list is"+size);
    }
}
public class SLLLinkedList {
    public static void main(String[] args) {
        sll1 list=new sll1();
        list.insertAtEnd(200);
        list.InsertAtHead(100);
        list.insertAtAnyIndex(1,300);
        //list.print();
        System.out.println( list.size);
        list.deleteAtHead();
        list.DeleteAtAnyIndex(1);
        list.print();
        System.out.println(list.size);
        list.insertAtAnyIndex(1,200);
        list.print();
        list.get(0);
        list.set(1,900);
        list.print();


    }
}
