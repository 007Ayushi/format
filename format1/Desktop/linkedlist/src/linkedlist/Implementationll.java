package linkedlist;

import linkedlist.Node;



class sll
{
    Node head;//default value is null
    Node tail;//default value is null
    int size;
    Node x;//deault value is 0

    void insertionAtEnd(int val){
        Node temp=new Node(val);
        if(head==null)head=tail=temp;
        else {
            tail.next=temp;
            tail=temp;
        }
        size+=1;
    }

    void insertAtHead(int val) {
        if (head == null) head = tail = null;
        else {
            Node temp = new Node(val);
            temp. next = head;
            head = temp;
        }
        size++;
    }
     void insertAtAnyPosition(int val,int index ){
        Node temp=new Node(val);
        Node x=head;
        if(index==0){
            temp.next=head;
            temp=head;
            size++;
        }
        if(index==size){
            tail.next=temp;
            tail=temp;
            size++;

        }
         if(index>size || index<0){
             System.out.println("couldnt insert in this position");
             return;
         }

         for (int i = 1; i <= index - 1; i++) {
             x=x.next;
         }
         temp.next = x.next;
         x.next = temp;
         size++;
    }
    int get(int index){
        Node t=head;
        if(index<0 || index>=size){
            System.out.println("will not get out the element");
            return 0;
        }
        if(index==0)
        {
            return head.val;
        }
        for(int i=1;i<=index-1;i++){
           t=t.next;
        }
        return t.val;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("list is empty");
        }
        head=head.next;
        size--;
    }
    void deleteAtTail(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node tt=head;
        for(int i=1;i<=size-1;i++){
            tt=tt.next;
        }
        tt.next=null;
        size--;
    }

    void print(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("length of linked list is"+ size);
    }

    }




public  class Implementationll {
    public static void main(String[] args) {
        sll list=new sll();
       // System.out.println(list.size);
        list.size();
        list.insertAtHead(100);
        list.insertAtHead(200);
        list.insertionAtEnd(10);
        list.insertionAtEnd(20);
        list.insertionAtEnd(30);
        list.insertionAtEnd(40);

        list.print();
        list.insertionAtEnd(200);
        list.print();
        System.out.println(list.size);

        list.print();
        list.insertAtAnyPosition(7000,3);
        list.print();
        System.out.println( list.get(3));
        list.deleteAtHead();
        list.print();
        list.deleteAtTail();
        list.print();

    }

}
