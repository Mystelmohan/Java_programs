
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        int found=0;
        if(str1.length()==str2.length()){
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(arr1[i]==arr2[j]){
                    found++;
                    break;
                }
            }
        }
    }
        if(str1.length()==found){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}
