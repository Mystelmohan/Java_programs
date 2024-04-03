package Assessment1;

import java.util.Scanner;

public class MaxSumOfAdjacent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxofAdj(arr,a,0));
        sc.close();
    }
    static int maxofAdj(int arr[],int n,int i){
          if(i>=n){
            return 0;
          }
          return Math.max(arr[i]+maxofAdj(arr, n, i+2), maxofAdj(arr, n, i+1));
    }
}
