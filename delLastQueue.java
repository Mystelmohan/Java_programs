import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Iterator; 

public class delLastQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayDeque<Integer> q1=new ArrayDeque<>();
        for(int i=0;i<a;i++){
            q1.add(sc.nextInt());
        }
        q1.removeLast();
        Iterator<Integer> itr= q1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        sc.close();
    }
}
