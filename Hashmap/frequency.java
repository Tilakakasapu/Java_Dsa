import java.util.HashMap;
import java.util.Map;

public  class frequency {
    static Map<Integer,Integer> mp = new HashMap<>();
     static int max_freq(int[] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                int val = mp.get(arr[i]);
                val+=1;
                mp.put(arr[i],val);
                max = Math.max(val,max);
            }else{
                mp.put(arr[i],1);
                max = Math.max(1,max);
            }
        }
        System.out.println(mp.entrySet());

        for(var i:mp.entrySet()){
            if(i.getValue()==max){
                return i.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] arr = {1,3,2,1,4,1};
      System.out.println(max_freq(arr)); 
    }
}
