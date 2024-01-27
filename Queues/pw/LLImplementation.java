public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int x){
            this.val = x;
        }
        Node(int x,Node next ){
            this.val = x;
            this.next = next;
        }
    }
    public static class queueLL{
        Node head =null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            if(size==0){
                Node temp = new Node(x);
                head = temp;
                tail = temp;
                temp.next = null;
                size++;
            }else{
            Node temp = new Node(x);
            tail.next = temp;
            tail = temp;
            size++;
            }
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is Empty!");
                return -1;
            }
            else{
                int ans = head.val;
                head = head.next;
                size--;
                return ans;
            }
            
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is Empty!");
                return -1;
            }
            return head.val;
        }
        public void display(){
            if(size==0) System.out.println("empty");
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
    }
}
