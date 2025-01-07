package BInaryTrees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }

}

public class Traversing {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        //System.out.println(a.left.val);
        display(a);
        System.out.println();
        int sum_of_trees=sum(a);
        System.out.println(sum_of_trees);
        System.out.println();
        int productNodes=product(a);
      //  System.out.println(productNodes);
        int prouct_of_nonzeroes=product_of_nonzeroes(a);
        System.out.println("product of non-zeroes elements"+prouct_of_nonzeroes);
        int maximum=max(a);
        System.out.println("maximum"+maximum);
        int minimum=min(a);
        System.out.println("minimum node is"+minimum);
        int sizeofTrees=size(a);
        System.out.println("size of trees"+sizeofTrees);
        int levels=levels(a);
        System.out.println(levels);
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
    }
    public static void display(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int sum(Node root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int product(Node root){
        if(root==null)return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static int product_of_nonzeroes(Node root){
        if(root==null || root.val == 0)return 1;
        return root.val*product_of_nonzeroes(root.left)*product_of_nonzeroes(root.right);
    }

    public static int max(Node root){
        if(root==null)return Integer.MIN_VALUE;
        int a=root.val;
        int b=max(root.left);
        int c=max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    public static int min(Node root){
        if(root==null)return Integer.MAX_VALUE;
        int a=root.val;
        int b=min(root.left);
        int c=min(root.right);
        return Math.min(a,Math.min(b,c));
    }
    public static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int levels(Node root){
        if(root==null)return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}
