package Traversal;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
       this.val=val;
    }}
public class usingQueuejava {
    static int n;
    public static void main(String[] args) {
        TreeNode a=new TreeNode(10);
        TreeNode b=new TreeNode(20);
        TreeNode c=new TreeNode(30);
        TreeNode d=new TreeNode(40);
        TreeNode e=new TreeNode(50);
        TreeNode f=new TreeNode(60);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;
       // travsersal(a);
       // nthLevel(a,0);
        n=3;
        for(int x=0;x<=3;x++){
            n=x;
            nthLevel(a,0);
            System.out.println();
        }
    }
    public static void nthLevel(TreeNode root,int level){
        if(root==null)return;
        nthLevel(root.left,level+1);
        if(level==n)System.out.println(root.val);
        nthLevel(root.right,level+1);
    }
    public static void  travsersal(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            TreeNode front=q.remove();
            System.out.println(front.val);
           if(front.right!=null) q.add(front.right);
           if(front.left!=null) q.add(front.left);
        }


    }
}
