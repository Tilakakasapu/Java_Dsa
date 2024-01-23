import java.util.Stack;
public class validParanthesis{
    public boolean isvalid(String s){
        Stack<Character> stk = new Stack<>();
        for (Character character : s.toCharArray()){
            if(character == '{'|| character == '['|| character == '('){
                stk.push(character);
            }else{
                if (character == ')') {
                    if (stk.isEmpty() || stk.pop() != '(') {
                      return false;
                    }
                  }
                  if (character == '}') {
                    if (stk.isEmpty() || stk.pop() != '{') {
                      return false;
                    }
                  }
                  if (character == ']') {
                    if (stk.isEmpty() ||stk.pop() != '[') {
                      return false;
                    }
                }
            }
            
        }
        return stk.isEmpty();
    }
    
    public static void main(String[] args) {
        
    }
}