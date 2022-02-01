import java.util.*;
public class Queues {
    
    public static void main(String[] args)
    {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(3);
        queue.add(10);
        queue.add(17);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());



    }
}
