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
        tail = node;
        this.size += 1;
    }

    public void insert(int value, int index) {
        head = insert_uRec(value, index, head);
    }

    public Node insert_uRec(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insert_uRec(value, index - 1, node.next);
        return node;
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

    public int length(Node head) {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;

    }

    public void deleteFirst() {
        head = head.next;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node node = get(size - 2);
        tail = node;
        tail.next = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node node = head;
        for (int i = 1; i < index; i++) {
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

    // --------------------------------------------- QUESTIONS
    // ------------------------------------------
    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        tail = node; // Update tail to the last non-duplicate node
        if (tail != null) {
            tail.next = null; // Ensure the tail's next is null
        }
    }

    // ------------------------------------------- merge two linked lists
    // ------------------------------------------

    public static linkedlist merge(linkedlist first, linkedlist second) {
        Node f = first.head;
        Node s = second.head;
        linkedlist ans = new linkedlist();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    // ------------------------------Happy number---------------------------
    static int find_squ(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num = num / 10;
        }
        return ans;
    }

    public boolean ishappy(int num) {
        int slow = num;
        int fast = num;
        do {
            slow = find_squ(slow);
            fast = find_squ(find_squ(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        } else {
            return false;
        }
    }

    // ----------------------------------------------merge
    // sort------------------------------------------
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    // class Solution {
    // public ListNode sortList(ListNode head) {
    // if(head == null||head.next==null){
    // return head;
    // }
    // ListNode mid = get_mid(head);
    // ListNode left = sortList(head);
    // ListNode right = sortList(mid);
    // return merge(left,right);
    // }
    // ListNode merge(ListNode left,ListNode right){
    // ListNode dummyhead = new ListNode();
    // ListNode tail = dummyhead;
    // while(left!= null && right != null){
    // if(left.val<right.val){
    // tail.next = left;
    // left = left.next;
    // tail = tail.next;
    // }
    // else{
    // tail.next = right;
    // right = right.next;
    // tail = tail.next;
    // }
    // }
    // while(left!= null){
    // tail.next = left;
    // left = left.next;
    // tail = tail.next;
    // }
    // while(right!= null){
    // tail.next = right;
    // right = right.next;
    // tail = tail.next;
    // }
    // return dummyhead.next;
    // }
    // ListNode get_mid(ListNode head){
    // ListNode midprev = null;
    // while(head!=null && head.next != null){
    // midprev = (midprev==null) ? head : midprev.next;
    // head = head.next.next;
    // }
    // ListNode mid = midprev.next;
    // midprev.next = null;
    // return mid;

    // }
    // }
    // =---------------------------------------- BUBBLE SORT
    // -------------------------------------------------
    public void bubble() {
        bubble_sort(size - 1, 0);
    }

    public void bubble_sort(int row, int col) {
        if (row == 0) {
            return;
        }
        while (col < row) {
            Node first = get(col);
            Node second = get(col + 1);
            if (first.value > second.value) {
                if (first == head) {
                    first.next = second.next;
                    second.next = first;
                    head = second;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                    tail = first;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            col++;
        }
        bubble_sort(row - 1, 0);
    }

    // --------------------------------------------- Reverse LIST
    // -----------------------------
    private void reverse_rec(Node node) {
        if (node == tail) {
            head = node;
            return;
        }

        reverse_rec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // ------------------------------------------Reverse List without recursionn
    // -------------
    private void reverse() {
        Node prev = null;
        Node pre = head;
        Node next = head.next;
        while (pre != null) {
            pre.next = prev;
            prev = pre;
            pre = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    // -------------------------------------- reversing inside of linked list   ----------------------------------
    



















    public static void main(String[] args) {
        // linkedlist ll = new linkedlist();
        // ll.insertFirst(1);
        // ll.insertFirst(1);
        // ll.insertFirst(1);
        // ll.insertLast(2);
        // ll.insertLast(4);
        // ll.insertLast(4);
        // ll.display();
        // ll.duplicates();
        // ll.display();
        linkedlist ll = new linkedlist();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(1);
        ll.insertLast(4);
        ll.insertLast(5);
        ll.insertLast(6);
        ll.display();
        ll.reverse_inside(2, 4);
        ll.display();
        // ll.bubble_sort(5, 0);
        // ll.display();
        // ll.reverse_rec(ll.head);
        // ll.display();
        // ll.reverse();
        // ll.display();
        System.out.println("completed");
        // linkedlist ll2 = new linkedlist();
        // ll2.insertFirst(2);
        // ll2.insertFirst(2);
        // ll2.insertFirst(2);
        // ll2.insertLast(3);
        // ll2.insertLast(5);
        // ll2.insertLast(5);
        // linkedlist ans = merge(ll, ll2);
        // ans.display();
    }

}