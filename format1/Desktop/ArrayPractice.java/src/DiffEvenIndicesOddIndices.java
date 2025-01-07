public class DiffEvenIndicesOddIndices {
    public static void main(String[] args) {
        int []arr={1,2,4,4};
        int n=arr.length;
        int sumodd=0;
        int sumeven=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                sumodd+=arr[i];
            }
            else{
                sumeven+=arr[i];
            }
        }
        int diff=sumeven-sumodd;
        System.out.println(diff);
    }
}
