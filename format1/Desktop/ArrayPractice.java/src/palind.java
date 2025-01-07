public class palind {
    public static void main(String[] args) {
        String[] words ={"abc","car","ada","racecar","cool"};
       String y= firstPalindrome(words);
        System.out.println(y);
    }



    public static String firstPalindrome(String[] words) {
        int flag = 0;
        String t = "";
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            t = sb.reverse().toString();
            if (t.equals(words[i]))
                return t;

        }

            return "";

    }
}
