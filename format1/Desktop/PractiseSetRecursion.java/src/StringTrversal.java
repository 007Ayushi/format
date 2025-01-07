public class StringTrversal {
    public  static void Traversal(String str,int i){
        if(i==str.length())return;
        System.out.print(str.charAt(i));
        Traversal(str,i+1);
    }
    public static void main(String[] args) {
        String str="ayushi";
        Traversal(str,0);
    }
}
