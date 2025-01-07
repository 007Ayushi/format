import com.sun.source.tree.BreakTree;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Counting_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter any string");
        String s="ayushi";
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
     System.out.println(count);
        inbuilt_methods();
      Print_substrings();
        convertIntoString();
        countingdigits();
        changing_substring(s);
        changing_even(s);
        methods();
        creating_StringBuilder(s);
        compares_method();
        convertIntoString();
        convertIntoStringBuilder();
        changing_cases();
        append_method();
    }
    public static boolean isVowel(char ch){
        if(ch == 'A' || ch=='a')return true;
        if(ch=='e'|| ch=='E')return  true;
        if(ch=='i' || ch=='I')return  true;
        if(ch=='o' || ch=='O')return  true;
        if(ch=='u' || ch=='U')return true;

      else{
          return false;
        }
    }
    public static void inbuilt_methods(){
        String a="ayushi gupta";
        String b="shyama";
        for(int i=0;i<a.length();i++){
            System.out.println(a.charAt(i));
        }
        System.out.println("length of given string is"+a.length());
        System.out.println("Indexs of string"+a.indexOf('a'));
        System.out.println("Last index of a"+a.lastIndexOf('a'));
        System.out.println(a.compareTo(b));
        System.out.println(a.contains("raj"));
        String c="Physics WAllaH skiLls";
        System.out.println(c.startsWith("phy"));
        System.out.println(c.startsWith("lls"));
        System.out.println(c.toLowerCase());
        String d=c.toLowerCase();
        System.out.println(d);
        System.out.println(c.toUpperCase());
        System.out.println(a.concat(b));
        System.out.println(a+b);
    }
    public  static void Print_substrings(){
        String sub="abcd";
        for(int i=0;i<=sub.length();i++){
            for(int j=i+1;j<=sub.length();j++){
                System.out.println(sub.substring(i,j));
            }
        }
    }
    public static void convertIntoString(){
        String g="";
        int y=10;
        System.out.println(g+y);

    }
    public static void countingdigits(){
        int digit=99990;
        String y=Integer.toString(digit);
    int length_digit=y.length();
        System.out.println("numbers of digits in a string is "+length_digit);
    }
    public static void changing_substring(String s){
        String o=s.substring(0,2)+'o'+s.substring(4);
        System.out.println(o);

    }
    public static void changing_even(String s) {
        String k = " ";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                k += "a";
            } else {
                k += s.charAt(i);
            }
        }
        System.out.println(k);
    }
        public static void methods(){
            String d="abc";
            String dd="";
            String ddd="xyz";
            String d4="abcxyz";
            String d5=d+ddd;
          String dddd="abc";
            System.out.println(d.equals(dddd));
            System.out.println();
            System.out.println(d4==d5);
            System.out.println(d4.equals(d5));
        }
        public static void creating_StringBuilder(String s){
        StringBuilder sb=new StringBuilder("ayushi");
            System.out.println("capacity of stringBuilder"+sb.capacity());
            System.out.println("reversed string is"+sb.reverse());
        }
        public static void compares_method(){
        String k1="ayushi";
        String k2="a";
            System.out.println(k1.compareTo(k2));
        }
        public static void convertIntoStringBuilder(){
          String j="ayushi gupta";
          StringBuilder sb=new StringBuilder("abcd");
          sb.setCharAt(0,'k');
            System.out.println(sb);
        }
        public static void changing_cases(){
        StringBuilder sb=new StringBuilder("MITY university jharkhand");
        int n=sb.length();

        for(int i=0;i<n;i++){
            char ch=sb.charAt(i);
           int ascii=(int)ch;
           if(ascii>=65 && ascii <=90){
               ascii+=32;
           }
           else if(ascii>=97 && ascii<=122){
               ascii-=32;
           }
           ch=(char)ascii;
           sb.setCharAt(i,ch);
        }
            System.out.println(sb);
        }
        public static void append_method(){
        StringBuilder sb=new StringBuilder("pqr");
            sb.append("uu");
            System.out.println(sb);
            sb.append("*");
            System.out.println(sb);
            char []ch={'r','a','m'};
            sb.append(ch);
            System.out.println(sb);
            int []arr={1,2,3,4,5};
            sb.append(arr);
            System.out.println(sb);
            sb.deleteCharAt(0);
            System.out.println(sb);
            sb.append("xyz");
            System.out.println(sb);
            sb.insert(1,90);
            System.out.println(sb);
            sb.delete(0,2);
            System.out.println(sb);
        }

}
