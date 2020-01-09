import java.util.ArrayList;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        // Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
        // Queue sorted with PriorityQueue then
        //Actual Queue: (Front) 1 2 3 4 5 6 7 8 9 10 (Rear)
        for (int i = 10 ; i > 0 ; i--){
            queue.add(i);
        }
        System.out.println("Queue size is "+queue.size());
        // Peeking using (methode peek()): Obtaining the head of the queue
//        queue.peek();
        System.out.println("Head of queue is "+queue.peek());

        // Polling using the method (poll()): Remove the head of the queue
        queue.poll();
        System.out.println("Queue size after poll() is "+queue.size());

        System.out.println("Head of queue after is "+queue.peek());



    }
}
