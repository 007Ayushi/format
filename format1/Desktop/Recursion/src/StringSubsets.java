public class StringSubsets {
    public static void subsets(String str,int i,String ans){
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }
        subsets(str,i+1,ans);
        subsets(str,i+1,ans+ str.charAt(i));
    }
    public static void main(String[] args) {
        String str="abc";
        subsets(str,0,"");
    }
}
