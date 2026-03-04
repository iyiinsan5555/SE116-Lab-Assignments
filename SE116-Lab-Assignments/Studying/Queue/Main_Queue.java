import java.util.Queue;
import java.util.LinkedList;

public class Main_Queue {
    public static void main(String[] args) {
        //FIFO --> First In First Out
        //Add --> Enqueue
        //Remove --> Dequeue
        //Queue is an Interface thus I will use LinkedList

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen"); //--> Enqueue
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        queue.poll(); //--> dequeue
        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println(queue.contains("Harold"));

    }
}
