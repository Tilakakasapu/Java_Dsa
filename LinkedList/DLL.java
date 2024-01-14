public class DLL {
    private Node head;
    private Node tail;
    private int size;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!= null){
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        node.next = null;
        Node last = head;
        if(head==null){
            node.prev = null;
            head = node;
            node.next = null;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next =node;
        node.prev = last; 
    }
    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.value+"->");
            node = node.next;
        }
        System.out.println("END");
    }
    public Node find(int num){
        Node node = head;
        while(node.value != num && node.next!=null){
            node = node.next;
        }
        if(node.value==num){
            return node;
        }
        else{
            return null;
        }
    }
    public void insert(int after,int val){
        Node p = find(after);
        if(p!= null){
            Node node = new Node(val);
            node.next = p.next;
            node.prev = p;
            if(p.next!=null){
                p.next.prev = node;
            }
            p.next= node;
        }
    }
   private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int val){
            this.value = val;
        }
        public Node(int val,Node next,Node prev){
            this.value =val;
            this.next = next;
            this.prev = prev;
        }
     }
    
}
