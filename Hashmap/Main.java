import java.util.*;
import javax.print.attribute.HashAttributeSet;

public class Main{
    static void HashMapMethods(){
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Tilak", 37); 
        mp.put("Saikiran",24);
        mp.put("Lokesh", 26);
        mp.put("Revanth",27);
        System.out.println(mp.get("Tilak")); // null if not exist

        mp.putIfAbsent("Tilak", 39);
        System.out.println(mp.get("Tilak"));

        System.out.println(mp.remove("Tilak"));
        System.out.println(mp.remove("riya"));

        System.out.println(mp.containsKey("Saikiran"));
        mp.putIfAbsent("Tilak", 37);

        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());
        
        for(String i:mp.keySet()){
            System.out.print(mp.get(i)+" ");
        }
        System.out.println();
        System.out.println();
        for(Map.Entry<String , Integer> e: mp.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println();System.out.println();
        for(var e: mp.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    
    
    public static void main(String[] args) {
        HashMapMethods();
    }
}