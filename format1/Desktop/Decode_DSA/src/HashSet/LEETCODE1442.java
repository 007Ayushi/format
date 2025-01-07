package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class LEETCODE1442 {
    public static void main(String[] args) {
        int count=0;
        int []nums={10,23,46,89,90};
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int rev=0;
            while(nums[i]>0){
                int rem=nums[i]%10;
                rev=(rev*10)+rem;
                nums[i]=nums[i]/10;
            }
            arr.add(rev);
        }
        Collections.sort(arr);

        HashSet<Integer> set=new HashSet<>(arr);
        System.out.println(arr);
        System.out.println(set.size());

        String []words={"ab","ba","cc"};
        int ans=maximumNumberOfStringPairs(words);
        System.out.println(ans);

    }
    public  static int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++)
        {
            if(Objects.equals(words[i], reverse(words[i + 1]))){
                count++;
            }
        }
        return count;
    }
    public static String reverse(String n){
        StringBuilder sb=new StringBuilder(n);
        return sb.reverse().toString();

    }
}
