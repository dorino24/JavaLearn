
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MainQueue {

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedBlockingDeque<>();
        for (int i = 0; i < 10; i++) {
            que.add(i);
        }
        System.out.println(que);

        Queue<Integer> que2 = new ArrayBlockingQueue<>(5);
        try {
            que2.offer(1);  //can also use add() method but it will throw an exception if the queue is full
            que2.offer(2);
            que2.offer(3);
            que2.offer(4);
            que2.offer(5);
            que2.remove();

        } catch (Exception e) {
            System.out.println("Queue is full");
        }
        System.out.println(que2);
        System.out.println(que2.poll());
        System.out.println(que2);
        System.out.println(que2.peek());
    }
}
