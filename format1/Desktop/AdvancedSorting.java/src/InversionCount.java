import java.util.Scanner;

public class InversionCount {
    static int count=0;
    public static void MergeSort(int []arr){
        int n=arr.length;

        if(n==1)return;
        int []a=new int[n/2];
        int []b=new int[n-n/2];

        for(int i=0;i<n/2;i++){
           a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        MergeSort(a);
        MergeSort(b);
        inversionCount(a,b,arr);
        sort(a,b,arr);
        a=null;
        b=null;




    }
    public  static void sort(int []a,int []b,int []arr){
        int i=0,j=0,k=0;
        while(i< a.length && j<b.length) {
            if (a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }

        while(i<a.length)arr[k++]=a[i++];
        while(j<b.length)arr[k++]=b[j++];
//
//
    }

    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void inversionCount(int []a,int []b,int []arr){

        int i=0;
        int j=0;

        while(i<a.length && j<b.length){
                if (a[i] > b[j]) {
                   count+=(a.length-i);
                   j++;
                }
                else {
                    i++;
                }

            }


        }

    public static void main(String[] args) {
        int []arr={10,45,20,100,40,23,90,67};
        print(arr);




        MergeSort(arr);
        print(arr);
        System.out.print(count);




    }
}
