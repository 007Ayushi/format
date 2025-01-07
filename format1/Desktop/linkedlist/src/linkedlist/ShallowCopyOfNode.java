package linkedlist;
class Node
{
  int val;
  Node next;
  Node temp;
  Node(int val){
      this.val=val;
  }

}
public class ShallowCopyOfNode {
    public static void main(String[] args) {
        Node a=new Node(100);
        Node temp=a;//shallow copy; temp as a full access of a
        //Node temp=new Node(100);//deep copy new object is created
        System.out.println(a);
        System.out.println(temp);

    }
}
