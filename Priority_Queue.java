import java.util.PriorityQueue;


public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        for(int i=5;i>0;i--){
            queue.add(i);
        }
        queue.offer(9);
       
        System.out.println(queue);
        // System.out.println("the head is "+queue.peek());
        // System.out.println(queue.poll());
        // System.out.println(queue);
        // System.out.println("the removed element is: "+queue.poll());
        // System.out.println("the head is: "+queue.remove());
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);
        // System.out.println(queue);
        // System.out.println(queue.element()+"   "+queue.poll());
        // System.out.println(queue.peek()+"   "+queue.remove()+"    "+queue.element());
        // System.out.println(queue);
    }
}
