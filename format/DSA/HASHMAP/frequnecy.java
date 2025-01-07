import java.util.HashMap;
 public class frequnecy {
    static int freq=0;
    public static void main(String[] args) {
        int []arr={1,2,3,4,1,2,1,1,1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
             if(mp.containsKey(freq)){
               mp.put(key,mp.get(key)+1);
             }
             else{
                mp.put(key,1);
             } 
             freq=mp.get(key);   
        }
        System.out.println(mp.entrySet());
    }
}
