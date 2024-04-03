
import java.util.*;
class prime{
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(isprime(a)){
        System.out.println("Prime");
    }else{
        System.out.print("Not");
    }
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