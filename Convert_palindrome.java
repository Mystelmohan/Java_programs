import java.util.Scanner;

public class Convert_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            int arr[]=new int[a[i]];
            for(int j=0;j<a[i];j++){
                 arr[j]=sc.nextInt();
            }
            System.out.println(pal(arr));
        }
        
       sc.close();
    }
    static int pal(int arr[]){
        int i=0;
        int j=arr.length-1;
        int a=arr[i],b=arr[j];
        int res=0;
        while(i<j){
            if(a<b){
                a+=arr[++i];
                res++;
            }else if(a>b){
                 b+=arr[--j];
                 res++;
            }else{
                a=arr[++i];
                b=arr[--j];
            }
        }
        return res;
    }
}
