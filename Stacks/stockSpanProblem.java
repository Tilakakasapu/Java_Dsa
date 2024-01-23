import java.util.Stack;
public class stockSpanProblem {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] res = new int[arr.length];
        res[0]= 1;
        Stack<Integer> stk  = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        stk.push(arr[0]);
        for(int i =1;i<arr.length;i++){
            int count =1;
            while(!stk.isEmpty()&&stk.peek()<arr[i]){
                stk2.push(stk.pop());
                count++;
            }
            res[i]=count;
            while(!stk2.isEmpty()){
                stk.push(stk2.pop());
            }
            stk.push(arr[i]);
        }
        for(int i:res){
            System.out.print(i + " ");
        }
    }
    
}
