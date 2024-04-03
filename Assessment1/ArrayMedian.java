package Assessment1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMedian {
    static double findMedianSortedArrays(int nums1[], int nums2[]) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int[m+n];
        System.arraycopy(nums1, 0, arr, 0, n);
        System.arraycopy(nums2, 0, arr, n, m);
        Arrays.sort(arr);
        int r=m+n;
        if(r%2==0){
            return (arr[(m + n) / 2 - 1] + arr[(m + n) / 2]) / 2.0;
         } else {
            
             return arr[(m + n) / 2];
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr1[]=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(arr1,arr2));
        sc.close();
    }
}
