import java.util.ArrayDeque;

import java.util.Scanner;

public class evennumQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        ArrayDeque<Integer> q1=new ArrayDeque<>();
        for(int i=1;i<=10;i++){
            q1.add(i);
        }
        for(int i:q1){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
