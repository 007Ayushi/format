

public class TraversingArray{
    public static void traversing(int []arr,int i){
        if(i==arr.length) return;;
        {
            System.out.println(arr[i]);
            traversing(arr,i+1);

        }

    }

    public static void main(String[] args) {
        int []arr={10,20,3,40,50,0,43};
        traversing(arr,0);

    }
}
