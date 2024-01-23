// import java.util.Stack;

// public class validParanthesismin {
//     public int minAddToMakeValid(String s) {
//         Stack<Character> stk = new Stack<>();
//         for (Character ch : s.toCharArray()) {
//             if(ch=='('){
//                 stk.push(ch);
//             }
//             else{
//                 if(!stk.isEmpty()&&stk.peek()=='('){
//                     stk.pop();
//                 }else{
//                     stk.push(ch);
//                 }
//             }
//             }
//         }
        
        
//         return 0;
//     }


    
// }






public class validParanthesismin {
    public int minInsertions(String s) {
        int right = 0;
        int left = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i)
            if(ch=='('){
                if(right%2>0){
                    right--;
                    left++;
                }
                right+=2;
            }
            else{right--;
                if(right<0){
                    right+=2;
                    left++;
                }
            }
        }
        return right+left;
    }
}