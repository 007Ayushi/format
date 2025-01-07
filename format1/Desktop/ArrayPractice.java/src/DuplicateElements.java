
public class DuplicateElements{
    public static void main(String[] args) {
        int []arr={10,20,10,-20,10,-20,-10,30,-30};
        int n=arr.length;
        int []brr=new int[arr.length];
        int index=0;

        for(int i=0;i<n;i++){
            boolean duplicateElements=false;
            for(int j=0;j < index;j++){
                if(arr[i]==brr[j]){
                    duplicateElements=true;
                    break;
                }
            }
            if(!duplicateElements){
                brr[index++]=arr[i];
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(brr[i]+" ");
        }
    }
}