public class ArrayTraversal {
    public static void ArrayTraversal(int []arr,int i)
    {
        if(i==arr.length)return;
        System.out.println(arr[i]);
        ArrayTraversal(arr,i+1);
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40};
        ArrayTraversal(arr,0);
    }
}
