import java.util.*;
public class Pair_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            if(isprime(i)){
                if(isprime(i+6)){
                    System.out.print("("+i+","+(i+6)+") ");
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
    static boolean isprime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
