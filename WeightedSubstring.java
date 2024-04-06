import java.util.Scanner;

public class WeightedSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=3;
        int b=1;
        int count=0;
        while(true){
            if(b==a){
                int ch=65+count;
                System.out.printf("%c",ch);
                break;
            }
           else{
                b*=i;
            }
            i++;
            count++;
        }
        sc.close();
    }
}
