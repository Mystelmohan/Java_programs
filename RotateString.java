import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
        if(ch=='R'){
            int l=str.length();
            String st1="";
            st1+=str.substring(l-n, l);
            st1+=str.substring(0,l-n);
            System.out.println(st1);
        }
        if(ch=='L'){
            int l=str.length();
            String st1="";
            st1+=str.substring(n, l);
            st1+=str.substring(0,n);
            System.out.println(st1);
        }
       sc.close();
    }
}
