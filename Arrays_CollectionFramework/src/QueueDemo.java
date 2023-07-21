import sun.misc.Queue;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        PriorityQueue q = new PriorityQueue<>();
        q.offer("a");
        //q.add(1);//ClassCastException
        q.add("v");
        System.out.println(q);//[a, v]
    }
}
