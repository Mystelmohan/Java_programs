import java.util.ArrayDeque;

public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.add(20);
        deque.addFirst(40);
        deque.addLast(50);
        deque.addFirst(60);
        deque.add(100);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
