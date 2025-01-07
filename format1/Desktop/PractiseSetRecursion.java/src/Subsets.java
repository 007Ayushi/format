public class Subsets {
    public static void subsets(int i,String str,String ans){
        if(i==str.length()){
            System.out.print(ans);
            return;
        }
        subsets(i+1,str,ans);
        subsets(i+1,str,ans+str.charAt(i));
    }
    public static void main(String[] args) {
        String str="abcd";
        subsets(0,str," ");

    }
}
