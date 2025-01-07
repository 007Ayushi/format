public class StringSubsets {
    public static  void subsets(int i,String s ,String ans)
    {
     if(i==s.length()) {
         System.out.println(ans);
         return;
     }
     else if(ans.charAt(i)<s.length())
     {
         subsets(i,s,ans);
         return;
     }
     else{
         ans+=s.charAt(i);
         subsets(i+1,s,ans);
     }
    }
    public static void main(String[] args) {
        String s="abcd";
        subsets(0,s,"");
    }
}
