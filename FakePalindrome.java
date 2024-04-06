import java.util.Scanner;

public class FakePalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       int j=1;
        int count=str.length();
        for(int i=0;i<str.length();i++){
            String s="";
            s+=str.charAt(i);
            j=i+1;
            while(j<str.length()){
                
                s+=str.charAt(j);
                
                if(ispalindrome(s)){
                    System.out.println(s);
                    count++;
                    j++;
                }else{
                    j++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
    static boolean ispalindrome(String s){
        StringBuilder input1 = new StringBuilder(s);
         String l=input1.reverse().toString();
        return s.equals(l);

 
    }
}
