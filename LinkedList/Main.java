public class Main {
    public static void main(String[] args) {
        // linkedlist ll = new linkedlist();
        // ll.insertFirst(3);
        // ll.insertFirst(1);
        // ll.insertFirst(0);
        // ll.insertLast(4);
        // ll.insert_at_index(2, 2);
        // ll.display();
        // // ll.deleteFirst();
        // // ll.deleteLast();
        // ll.delete(2);
        // ll.display();

        DLL ll = new DLL();
        ll.insertFirst(3);
        ll.insertFirst(1);
        ll.insertFirst(0);
        ll.insertLast(4);
        // ll.insert_at_index(2, 2);
        ll.display();
        ll.insert(1, 2);
        ll.display();
    }
}
