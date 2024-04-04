import java.util.Scanner;

public class Hack_the_money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(fun(arr[i],1)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        sc.close();
    }
    static boolean fun(int a,int b){
        if(a==b){
            return true;
        }
        else if(a<b){
            return false;
        }
        else{
            if(fun(a,10*b)){
                return true;
            }
            if(fun(a,20*b)){
                 return false;
            }
        }
        return false;
    }
}
