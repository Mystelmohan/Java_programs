package Assessment1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Largest_substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input =sc.nextLine();
        System.out.println(findMaxSubstring(input));
        sc.close();
    }

    public static String findMaxSubstring(String s) {
        Set<Character> set = new HashSet<>();
        String maxSubstring = "";
        int left = 0, right = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                if (maxSubstring.length() < right - left) {
                    maxSubstring = s.substring(left, right);
                }
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxSubstring;
        
    }
}

