import java.util.LinkedList;

public class hashmap_implementation {
    static class MyHashMap<K,V> {
    public static final int DEFAULT_CAPACITY = 4;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private class Node{
        K key;
        V value;
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private int size;
    private LinkedList<Node>[] buckets;

    public int size() {
        return size;
    }

    private void initBuckets(int capacity) {
        buckets = new LinkedList[capacity];
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    private int HashFunc(K key) {   
        int hc = key.hashCode();
        return (Math.abs(hc)) %  buckets.length;
    } 
    private int searchInBucket(LinkedList<Node> ll, K key){
        for(int i = 0; i < ll.size(); i++) {
            Node node = ll.get(i);
            if(node.key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public MyHashMap(){
        initBuckets(DEFAULT_CAPACITY);
    }
    public void put(K key, V value) {
        int bi = HashFunc(key);
        LinkedList<Node> currentbucket = buckets[bi];
        int ei = searchInBucket(currentbucket, key);
        if(ei==-1) {
            Node node = new Node(key, value);
            currentbucket.add(node);
            size++;
        }
        else{
            Node node = currentbucket.get(ei);
            node.value = value;
            size++;
        }
    }

    public V get(K key) {
        int bi = HashFunc(key);
        LinkedList<Node> currentbucket = buckets[bi];
        int ei = searchInBucket(currentbucket, key);
        if(ei==-1) {
            return null;
        }
        else{
            Node node = currentbucket.get(ei);
            return node.value;
        }
    }
    public V remove(K key) {
        int bi = HashFunc(key);
        LinkedList<Node> currentbucket = buckets[bi];
        int ei = searchInBucket(currentbucket, key);
        if(ei==-1) {
            return null;
        }
        else{
            Node node = currentbucket.remove(ei);
            size--;
            return node.value;
        }
    }
    
    

        
    }


    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("India", 100);
        map.put("China", 200);
        map.put("US", 300);
        map.put("UK", 400);
        map.put("Australia", 500);
        System.out.println(map.size());
        System.out.println(map.get("India"));
        System.out.println(map.get("China"));
        System.out.println(map.get("US"));
        System.out.println(map.get("UK"));
        System.out.println(map.get("Australia"));
        System.out.println(map.remove("Australia"));
        System.out.println(map.size());
        System.out.println(map.get("Australia"));
        System.out.println(map.remove("Australia"));
        System.out.println(map.size());
        
    }
}
