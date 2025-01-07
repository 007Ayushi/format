public class fazalsecmax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        _2ndlarget(arr);
//        seclargest(arr);
  }

    public static void _2ndlarget(int arr[]) {
        int _1st = Integer.MIN_VALUE;
        int _2nd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > _1st) {
                _2nd = _1st;
                _1st = arr[i];
            }
        }
        System.out.println("2nd largest ele in the array is :-  " + _2nd);
        System.out.println(_1st);
    }
        public static void seclargest(int []arr){
        int mx=arr[0];
        int smx=arr[0];
            for(int i=0;i<arr.length;i++){
              if(arr[i]>mx){
                  mx=arr[i];
              }
             if(arr[i]!=mx && arr[i]>smx){
                 smx=arr[i];
             }
            }
            System.out.print(smx+" ");
        }
    }
