import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String str="baca";
        System.out.println(lengthofLongest(str));
    }
    static int lengthofLongest(String s){
        int j=0,max=0,i=0;
        Set<Character> s1=new HashSet<>();
        while(j<s.length()){
            if(!s1.contains(s.charAt(j))){
                s1.add(s.charAt(j));
                j++;
                max=Math.max(max,j-i);
            }else{
                s1.remove(s.charAt(i));
                i++;
            }
            
        }
        return max;
    }
}
