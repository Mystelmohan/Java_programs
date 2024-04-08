import java.util.Scanner;

public class LongestPlaindrome {
        public static String longestPalindrome(String s) {
            int n=s.length();
            int i=0,j=0;
            int max=0;
            String max_str="";
            String str="";
            while(i<n){
                str+=s.charAt(i);
                if(ispalindrome(str)){
                    if(str.length()>max){
                        max_str=str;   
                    }
                }else{
                    j++;
                    str=str.substring(j, i-1);
                }
                    i++;
               
            }
            return max_str;
        
        }
        public static boolean ispalindrome(String str){
            String a="";
            for(int i=str.length()-1;i>=0;i--){
                a+=str.charAt(i);
            }
            if(a.equals(str)){
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println(longestPalindrome(s));
            sc.close();
        }
    }


