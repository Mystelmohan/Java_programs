import java.util.ArrayDeque;

import java.util.Scanner;



public class queueremove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayDeque<Character> q1=new ArrayDeque<>();
        for(int i=0;i<a;i++){
            q1.add(sc.next().charAt(0));
        }
        
        for(int i=0;i<a;i++){
            System.out.print(q1.peek()+" ");
            System.out.print(q1.poll()+" ");
        }
        System.out.println(q1.poll());
        sc.close();
    }
}
