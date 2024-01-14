import java.util.ArrayList;

public class permutations {
    static void permutations1(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        int n = p.length();
        for(int i=0;i<=n;i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutations1(f+ch+s, up.substring(1));
        }
    }

    static int permutationcount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        int n = p.length();
        for(int i=0;i<=n;i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = count +permutationcount(f+ch+s, up.substring(1));
        }
        return count;
    }
    static ArrayList<String> permutationslist(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans1 = new ArrayList<>();
        char ch = up.charAt(0);
        int n = p.length();
        for(int i=0;i<=n;i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            ArrayList<String> ans= permutationslist(f+ch+s, up.substring(1));
            ans1.addAll(ans);        
        }
        return ans1;
    }
    
    public static void main(String[] args) {
        String str = "abhisri";
        System.out.println(permutationcount("",str));
        System.out.println(permutationslist("", str));

    }
    
}
