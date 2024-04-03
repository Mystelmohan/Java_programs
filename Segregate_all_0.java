import java.util.Arrays;
import java.util.Scanner;

public class Segregate_all_0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<a;i++){
        //     for(int j=i+1;j<a;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        int arr1[]=new int[a];
        int count=0;
        for(int i=0;i<a;i++){
             if(arr[i]==1){
                count++;
             }
        }
        Arrays.fill(arr1,0);
        for(int i=a-1;count>0;i--){
            arr1[i]=1;
            count--;
        }
        for(int i=0;i<a;i++){
            System.out.print(arr1[i]+" ");
        }
        sc.close();
    }
}
