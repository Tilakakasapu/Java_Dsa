public class circular_queue {
    public static class cqa {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int x) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            }
            if (size == 0) {
                f = 0;
                r = 0;
                arr[f] = x;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[r] = x;
            } else {
                arr[++r] = x;
            }
            size++;
        }

        public int remove() {
            int removed;
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            } else if (f == arr.length - 1) {
                removed = arr[f];
                f = 0;
                size--;
                return removed;
            } else {
                removed = arr[f];
                f = f + 1;
                size--;
                return removed;
            }
        }
        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            else{
                return arr[f];
            }
        }

        public void display(){
            if( size==0) {
                System.out.println("queue is EMpty");
                return;
            }
            else if(f<=r){
                for(int i =f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            else{
                for(int i=f;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i =0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) throws Exception{
        cqa q = new cqa();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
        q.add(3);
        q.display();
        System.out.println(q.peek());
        q.add(4);

    }
}