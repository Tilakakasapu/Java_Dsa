public class main {
    public static void main(String[] args) {
        // Custom_Queues queue = new Custom_Queues(5);
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);
        // queue.display();
        // queue.remove();
        // queue.display();

        Circular_Queue queue = new Circular_Queue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        queue.remove();
        queue.insert(7);
        queue.display();



    }
}
