//public class SkkipingCharacter {
//
//        public static void print ( int i, String ans,String s)
//        {
//            if (i == s.length())
//           {
//              System.out.print(ans);
//              return;
//       }
//            if(s.charAt(i)!='a')
//              print(i+1,ans+s.charAt(i),s);
//            else
//                print(i+1,ans,s);
//
//
//        }
//        public static void main (String[]args){
//        String s = "ayushi";
//        String ans=" ";
//        print(0, ans,s);
//    }
//    }

public class SkkipingCharacter
{
    public static  void print(int i,String s, String ans) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        if (s.charAt(i) != 'a')
            ans += s.charAt(i);
        print(i + 1, s, ans);
        }


    public static void main(String[] args) {
        String s="ayushi gupta";
        print(0,s," ");

    }
}



