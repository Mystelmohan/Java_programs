import java.util.*;
class Nearest_prime{
    public static boolean isPrime(int num) {
        if(num<=1)
        {
           return false;

        }
        for(int i=2;i*i<=num;i++)
        {
           if(num%i==0)
           {
               return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int p1=0,p2=0,count=0,count1=0;
        int arr[]=new int[3];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        
        }
        for(int i=0;i<n;i++){
        int a=arr[i]+1;
        while(true)
        {
            if(isPrime(a)){
              p1=a;
              
              break;
            }
            a++;
            count++;
        }
        int  b= arr[i]-1;
        while(true)
        {
            if(isPrime(b)){
              p2=b;
              break;
            }
            b--;
            count1++;

        }
        if(count>count1)
        {
            System.out.println(p2);
        }
        else{
            System.out.println(p1);
        }

        
    }
}
}