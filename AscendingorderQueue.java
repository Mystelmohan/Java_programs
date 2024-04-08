import java.util.PriorityQueue;

public class AscendingorderQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q1=new PriorityQueue<>();
        q1.add(7);
        q1.add(6);
        q1.add(9);
        q1.add(8);
        q1.add(5);
        
       for(Integer i=q1.poll();i!=null;i=q1.poll()){
        System.out.println(i);
       }
    }
}
