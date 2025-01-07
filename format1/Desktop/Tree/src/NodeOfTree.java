
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public class NodeOfTree {
    public static  void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(6);
        Node c=new Node(8);
        Node d=new Node(4);
        Node e=new Node(11);
        int sum=0;
        a.left=b;
        a.right=c;
        b.left=d;
        d.right=e;
        display(a);
        //System.out.println(sum(a));
        //System.out.println(product(a));
        System.out.println(product_nonzeroes(a));
        System.out.println(maximum(a));
        System.out.println(minimum(a));
        System.out.println(size(a));
        System.out.println(levels(a));
        Node invert=invertTree(a);
        System.out.println(invert);

    }
    private static void display(Node root){
        if(root==null)return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);

    }

    private static int sum(Node root){
        if(root==null)return 0;
       return root.val+sum(root.left)+sum(root.right);
    }
    private static int product(Node root){
        if(root==null)return 1;
        return root.val*product(root.left)*product(root.right);
    }
    private static int product_nonzeroes(Node root){
        if( root==null || root.val==0  )return 1;
        return root.val*product_nonzeroes(root.left)*product_nonzeroes(root.right);
    }
    private static int maximum(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maximum(root.left),(maximum(root.right))));
    }
    private static int minimum(Node root){
        if(root==null)return Integer.MAX_VALUE;
        int a=root.val;
        int b=minimum(root.left);
        int c=minimum(root.right);
        return Math.min(a,Math.min(b,c));
    }
    private static int size(Node root){
        if(root==null)return 0;
        int a=1;
        int b=size(root.left);
        int c=size(root.right);
        return a+b+c;
    }
    private static int levels(Node root){
        if(root==null)return 0;
        int a=1;
        int b=levels(root.left);
        int c=levels(root.right);
        return a+Math.max(b,c);
    }
public static Node invertTree(Node root){
        if(root==null)return null ;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;

}
}
