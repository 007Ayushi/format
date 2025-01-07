



class ListNode1{
    ListNode1 next;
    int value;
    ListNode1(int value){
        this.value=value;
    }
}
class sll2 {
    ListNode1 head;
    ListNode1 tail;
    ListNode1 temp;
    int size = 0;

    void InsertAtHead(int value) {
        ListNode1 temp = new ListNode1(value);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAtEnd(int value) {
        ListNode1 temp = new ListNode1(value);
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
            ListNode1 temp = new ListNode1(value);
            ListNode1 x = head;
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
        ListNode1 temp=head;
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
        ListNode1 temp=head;
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
        ListNode1 temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        temp.value=value;

    }
    void print(){
        ListNode1 temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("the length of a linked list is"+size);
    }
    void FindNthNode(int n){
        ListNode1 fast=head;
        ListNode1 slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            System.out.println(head.next);
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.next.value);

    }
}
public class FindNthNodeFromLast {
    public static void main(String[] args) {
        sll2 list=new sll2();
//        list.insertAtEnd(200);
//        list.InsertAtHead(100);
//        list.insertAtAnyIndex(1,300);
//        System.out.println( list.size);
//        list.deleteAtHead();
//        list.DeleteAtAnyIndex(1);
//        System.out.println(list.size);
//        list.insertAtAnyIndex(1,200);
//        list.print();
//        list.get(0);
//        list.set(1,900);
//        list.print();
        list.insertAtEnd(500);
        list.InsertAtHead(400);
        list.InsertAtHead(300);
        list.InsertAtHead(200);
        list.InsertAtHead(100);
        list.print();
        list.FindNthNode(2);




    }
}

