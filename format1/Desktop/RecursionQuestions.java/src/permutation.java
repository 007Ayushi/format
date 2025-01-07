public class permutation{
    public static void main(String[] args) {
        String s="abc";
        String ans="";
        print(ans,s);
    }

    public static void print(String ans,String s){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
       for (int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           String left=s.substring(0,i);
           String right=s.substring(i+1);
           print(ans+ch,left+right);
       }
    }
}