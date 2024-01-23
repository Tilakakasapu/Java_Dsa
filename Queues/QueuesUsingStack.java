import java.util.Stack;
public class QueuesUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueuesUsingStack(){
        first = new Stack<>();
        second= new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }
    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public static void main(String[] args) {
        QueuesUsingStack queue = new QueuesUsingStack();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.remove());
        queue.add(6);
    }

}
