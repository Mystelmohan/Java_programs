
import java.util.Scanner;

/**
 * UniqueNumber
 */
public class UniqueNumber {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("-------------------------------");
    int count=0;
    for(int i=a;i<=b;i++){
        if(isUnique(i)){
           
            System.out.println(i);
            count++;
        }
    }
    System.out.println(count);
    sc.close();
   }
   static boolean isUnique(int n){
    int c=0;
    int a=n;
     while(a>0){
        a/=10;
        c++;
     }
    int arr[]=new int[c];
    for(int i=0;i<c;i++){
        arr[i]=n%10;
        n/=10;
    }
    for(int i=0;i<c;i++){
        for(int j=i+1;j<c;j++){
            if(arr[i]==arr[j]){
                return false;
            }
        }
    }
    return true;
}
}