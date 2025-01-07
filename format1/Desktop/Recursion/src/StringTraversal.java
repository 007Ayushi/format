public class StringTraversal {
    public  static void StringTraverse(int i,String str){
        if(i==str.length())return;
        System.out.print(str.charAt(i));
        StringTraverse(i+1,str);

    }

    public static void main(String[] args) {
        String str="ayushi";
        StringTraverse(0,str);
    }
}
