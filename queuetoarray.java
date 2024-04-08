import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class queuetoarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        ArrayDeque<Integer> q1=new ArrayDeque<>();
        for(int i=0;i<a;i++){
            q1.add(sc.nextInt());
        }
        int arr[]=new int[a];
        Iterator<Integer> itr=q1.iterator();
        int i=0;
        while(itr.hasNext()) {
            arr[i]=itr.next();
            i++;
        }
        for(int j=0;j<a;j++){
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
