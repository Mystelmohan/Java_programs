import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int current,prev=10000;
        int max_profit=0;
        for(int i=0;i<n;i++){
            current=sc.nextInt();
            if(current>prev){
                max_profit+=current-prev;
            }
            prev=current;
        }
        System.out.println(max_profit);
        sc.close();
    }
}
