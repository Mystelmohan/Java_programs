package Java_programs;
import java.util.Scanner;

public class Anagram_by_Ascii {
    public static int findAnagram(char[] arr1,char arr2[]){
        int[] num1=new int[26];
        int[] num2=new int[26];
        for(int i=0;i<arr1.length;i++){
           num1[arr1[i]-'a']++;
        }
        for(int i=0;i<arr2.length;i++){
            num2[arr2[i]-'a']++;
         }
         if(num1!=num2){
             return 0;
         }
         return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        int found=findAnagram(arr1, arr2);
        if(found==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}
