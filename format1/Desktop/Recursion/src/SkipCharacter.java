public class SkipCharacter {
    public static void skip(String str,int i,String ans){
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }

        if(str.charAt(i)!='a')ans+=str.charAt(i);
        skip(str,i+1,ans);
        }
    public static void main(String[] args) {
        String str="ayushi gupta";
        skip(str,0," ");
    }
}
