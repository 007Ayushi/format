import java.util.Scanner;

public class QuickSortSelect {

    public static int partition(int []arr,int lo,int hi){
        int pivot=arr[lo];
        int pivotIdx=lo;
        int smallercount=0;
        for(int i=lo+1;i<=hi;i++){
            if(arr[i]<=pivot)smallercount++;
        }
        int correctidx=smallercount+pivotIdx;
        swap(arr,pivotIdx,correctidx);
        int i=lo,j=hi;
        while(i<correctidx && j >correctidx){
            if(arr[i]<=pivot)i++;
            else if(arr[j]>pivot)j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctidx;

    }
    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void quicksort(int []arr,int lo,int hi){
        if(lo>=hi)return;
        int idx=partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }
    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
public static void kthelement(int []arr,int k,int n){
        int element=0;
        for(int i=0;i<=n-1;i++){
             element=arr[i+1];
        }
         System.out.print(element);
}
    public static void main(String[] args) {
        int []arr={4,9,7,1,2,3,6};
        int n=arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
        int k=4;
        kthelement(arr,k,n-1);

    }
}
