public class Custom_Queues {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public Custom_Queues() {
        this(DEFAULT_SIZE);
    }

    public Custom_Queues(int size) {
        this.data = new int[size];
    }

    public boolean isfull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isfull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -111111;
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }
    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return data[0];
    }
    public void display(){
        for(int i =0;i<end;i++){
            System.out.print(data[i]+"<- ");
        }
        System.out.println("END");
    } 

}