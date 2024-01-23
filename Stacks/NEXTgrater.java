import java.util.Stack;

public class NEXTgrater {
    public static void main(String[] args) {
        int[] arr = {2,5,4,5,8,3,1,4,6,7};
        int[] res = new int[arr.length];
        int n = arr.length;
        res[n-1] = -1;
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[n-1]);
        for(int i =n-2;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()) res[i] =-1;
            else res[i] = stk.peek();
            stk.push(arr[i]);
        } 

        for(int i:arr){
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i :res){
            System.out.print(i+" ");
        }
    } 
}
