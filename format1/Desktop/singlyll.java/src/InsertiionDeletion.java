class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val=val;
    }
}
//class dll{
//    dNode head;
//    dNode tail;
//   void inserttail(int val){
//        dNode temp=new dNode(val);
//        tail.next=temp;
//        temp.prev=tail;
//        temp.next=null;
//    }
//   void print(){
//        dNode temp=head;
//        while(temp.next!=null){
//            System.out.print(temp.val+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//    }
//}
public class InsertiionDeletion {
    public  static void print(dNode  head){
        dNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void ispalindrome(dNode head,dNode tail){
        dNode temp1=head;
        dNode temp2=tail;
        while(temp1!=null && temp2!=null && temp1.next!=temp2 && temp1!=temp2){
            if(temp1.val!=temp2.val){
                System.out.println("not palindrome");
                return;
            }
            else{
                temp1=temp1.next;
                temp2=temp2.prev;
            }
        }
        System.out.println("palindrome");
    }
//    public static void InsertAtTail(int val,dNode head,dNode tail){
//        dNode temp=head;
//        dNode x=new dNode(val);
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next=x;
//        x.prev=temp;
//        x.prev=null;
//    }

    public static void main(String[] args) {
        //dll list=new dll();
        dNode a=new dNode(30);
        dNode b=new dNode(90);
        dNode c=new dNode(30);
        dNode d=new dNode(90);
        dNode e=new dNode(30);
        a.next=b;
        b.prev=null;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
//      list.inserttail(200);
//      list.inserttail(300);
        print(a);
        ispalindrome(a,e);
        print(a);

    }
}
