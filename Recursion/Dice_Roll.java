import java.util.ArrayList;

public class Dice_Roll {
    static void target_Dice(String com,int target,int faces){
        if(target==0){
            System.out.println(com);
        }
        for(int i =1;i<=faces&&i<=target;i++){
            target_Dice(com + i, target-i,faces);
        }
    }
    static ArrayList<String> target_Dice_list(String com,int target,int faces){
        if(target==0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(com);
            return ans;
            // System.out.println(com);
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i =1;i<=faces&&i<=target;i++){
        ArrayList<String> ans1 = target_Dice_list(com +i+" ", target-i,faces);
        ans.addAll(ans1);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(target_Dice_list("", 2,8));
    }
    
}
