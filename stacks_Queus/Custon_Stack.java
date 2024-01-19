public class Custon_Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
     int ptr = -1;
     public  Custon_Stack(){
        this(DEFAULT_SIZE);
     }
     public Custon_Stack(int size){
        this.data = new int[size];
     }
      public boolean push(int item){
        if(isfull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
      }
      public int pop(){
        if(isEmpty()){
            System.out.println("cannot coz empty stack");
        }
        return data[ptr--];
      }
      public boolean isfull(){
        return ptr == data.length -1;
      }
      public boolean isEmpty(){
        return ptr == -1;
      }
}