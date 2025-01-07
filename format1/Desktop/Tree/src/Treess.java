class Node1{
    Node1 left;
    Node1 right;
    int val;
    Node1(int val){
        this.val=val;
    }
}
public class Treess {
    public static void main(String[] args) {
        Node1 a=new Node1(10);
        Node1 b=new Node1(20);
        Node1 c=new Node1(30);
        Node1 d=new Node1(40);
        Node1 e=new Node1(50);
        Node1 f=new Node1(60);
        Node1 g=new Node1(70);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        c.right=g;


        Node1 p=new Node1(10);
        Node1 q=new Node1(20);
        Node1 r=new Node1(30);
        Node1 s=new Node1(40);
        Node1 t=new Node1(50);
        Node1 u=new Node1(60);
        Node1 v=new Node1(70);
        p.left=q;
        p.right=r;
        q.left=s;
        q.right=t;
        r.left=u;
        r.right=v;


        display(a);
        System.out.println("\n");
        int sumOfRoot=sum(a);
        System.out.println(sumOfRoot);
        int productOfRoot=product(a);
        System.out.println(productOfRoot);
        //System.out.println();
       // System.out.println(productOFNONZEROES(a));
        int maximum=max(a);
        System.out.println(maximum);
        System.out.println();
        int min_val=minimum(a);
        System.out.println(min_val);
        int sizeOfRoot=size(a);
        System.out.println(sizeOfRoot);
        int levelsofRoot=levels(a);
        System.out.println(levelsofRoot);
        preOrder(a);
        System.out.println();
        postOrder(a);
        System.out.println();
        InOrder(a);
       // InvertBinaryTree(a);
        System.out.println();
       //display(a);
       boolean  isSame=isSameTree(a,p);
       System.out.println(isSame);
       display(a);
        System.out.println();
       display(p);
    }
    public static void display(Node1 root){
        if(root==null)return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int sum(Node1 root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int product(Node1 root){
        if(root==null)return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static int productOFNONZEROES(Node1 root){
        if(root==null||root.val==0 )return 1;
        return root.val*productOFNONZEROES(root.left)*productOFNONZEROES(root.right);
    }
    public static int max(Node1 root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.val,(Math.max(max(root.left),max(root.right))));
    }
    public static int minimum(Node1 root){
        if(root==null)return Integer.MAX_VALUE;
        return Math.min(root.val,(Math.min(minimum(root.left),minimum(root.right))));
    }
    public static int size(Node1 root){
        if(root==null)return 0;
        int a=1;
        int b=size(root.left);
        int c=size(root.right);
        return a+b+c;
    }
    public static int levels(Node1 root){
        if(root==null)return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static void preOrder(Node1 root){//root left right
        if(root==null)return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node1 root){// left right root
        if(root==null)return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+" ");
    }

    public static void InOrder(Node1 root){// left  root right
        if(root==null)return;
        preOrder(root.left);
        System.out.print(root.val+" ");
        preOrder(root.right);
    }
    public static Node1 InvertBinaryTree(Node1 root){
        if(root==null)return null;
        if(root.left==null && root.right==null)return root;
        Node1 temp=root.left;
        root.left=root.right;
        root.right=temp;

        InvertBinaryTree(root.left);
        InvertBinaryTree(root.right);
        return root;
    }
    public static boolean isSameTree(Node1 a,Node1 p){
        if(a==null && p==null)return true;
        if(a==null || p==null)return false;
        if(a.val!= p.val)return false;
        return isSameTree(a.left,p.left) && isSameTree(a.right,p.right);
    }
    



}
