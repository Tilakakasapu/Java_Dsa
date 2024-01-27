import java.util.LinkedList;
import java.util.Queue;

public class display_queue{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> q1 = new LinkedList<>();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q1.add(q.peek());
            q.remove();
        }
        while(!q1.isEmpty()){
            q.add(q1.peek());
            q1.remove();
        }
    }
}