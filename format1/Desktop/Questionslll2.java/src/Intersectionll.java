class node{
    node next;
    int val;

    node(int val){
        this.val=val;
    }

}
class Node1{
    Node1 Next;
    int value;
    Node1(int value){
        this.value=value;
    }
}

class sll{
    node head;
    node tail;
    int size;
    node temp;
    void length(){
        node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        size++;
    }
    void size(){
        System.out.println("size"+ size);
    }

}
public class Intersectionll {
    public static void main(String[] args) {
        sll list=new sll();
        node a=new node(10);
        node b=new node(20);
        node c=new node(30);
        Node1 d=new Node1(40);
        Node1 e=new Node1(50);
        Node1 f=new Node1(60);
        node g=new node(70);
        Node1 h=new Node1(70);
        node i=new node(80);
        Node1 j=new Node1(80);
        a.next=b;
        b.next=c;
        c.next=g;
        g.next=h;

        list.length();
        list.size();

    }


}
