package Java_programs;
import java.util.Arrays;
import java.util.Scanner;

public class UniqueNum_easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[10];
        boolean flag=false;
        int count=0;
        for(int i=a;i<=b;i++){
            Arrays.fill(arr,0);
            int temp=i;
            flag=false;
            while(temp>0){
                int digit=temp%10;
                temp/=10;
                if(arr[digit]==0){
                    arr[digit]++;
                      flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
