public class linkedlist {
    private Node head;
    private Node tail;
    private int size;

    public linkedlist() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        node.value = val;
        if (tail == null) {
            tail = head;
        }
        this.size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        this.size += 1;
    }

    public void insert_at_index(int num, int val) {
        Node temp = head;
        if (num == 0) {
            insertFirst(val);
            return;
        }
        if (num == size) {
            insertLast(val);
            return;
        }
        for (int i = 1; i < num; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size += 1;
    }

    public void deleteFirst(){
        head=head.next;
    }
    public Node get(int index){
        Node node = head;
        for(int i =0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void deleteLast(){
        if(size<=1){
            deleteFirst();
            return ;
        }
        Node node = get(size-2);
        tail = node;
        tail.next=null;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node node = head;
        for(int i=1;i<index;i++){
            node = node.next;
        }
        node.next = node.next.next;
    }
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }
}