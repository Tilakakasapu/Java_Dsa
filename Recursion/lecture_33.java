import java.util.ArrayList;
import java.util.Arrays;

public class lecture_33 {
    static void sub_sequence(String p,String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        sub_sequence(p+up.charAt(0), up.substring(1));
        sub_sequence(p, up.substring(1));
    }
    static ArrayList<String> sub_sequence_list(String p,String up,ArrayList <String> ans){
        if(up.length()==0){
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans1 = new ArrayList<>(sub_sequence_list(p+up.charAt(0), up.substring(1),ans));
        ArrayList<String> ans2  = new ArrayList<>(sub_sequence_list(p, up.substring(1),ans));
        ans1.addAll(ans2);
        return ans2;   
    }
    static ArrayList<ArrayList<Integer>> sub_sequence_iterative(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
        int n = outer.size();
        for(int i=0;i<n;i++){
        ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
        internal.add(num);
        outer.add(internal);
        }
    }
    return outer;
}

static ArrayList<ArrayList<Integer>> sub_sequence_iterative_duplicates(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0,end=0;
        for(int i=0;i<arr.length;i++){
        start =0;
        if(i>0&&arr[i]==arr[i-1]){
            start=end+1;
        }
        end = outer.size()-1;
        int n = outer.size();
        for(int j=start;j<n;j++){
        ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
        internal.add(arr[i]);
        outer.add(internal);
        }
    }
    return outer;
}
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        sub_sequence_list("","abc",ans);
        System.out.println(ans);
        int[] arr = {1,2,2,3};
        System.out.println(sub_sequence_iterative_duplicates(arr));
    }
}
