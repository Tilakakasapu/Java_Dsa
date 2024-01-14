public class lecture_32_recursion {
    // static String remove_A(String str,String ans,int i){
    //     if(i==str.length()){
    //         System.out.println(ans);
    //         return "";
    //     }
    //     if(str.charAt(i)=='a'){
    //         return remove_A(str, ans, i+1);
            
    //     }
    //     else{
    //         return str.charAt(i)+remove_A(str, ans, i+1);
            
    //     }
            
    //     }
    // public static void main(String[] args) {
    //     String str = "prasanth";
    //     System.out.println(remove_A(str, "", 0));
    // }


        static String rmv_apple(String str){
            if(str.isEmpty()){
                return "";
            }
            if(str.startsWith("apple")){
                return rmv_apple(str.substring(5));
            }
            else{
                return str.charAt(0)+rmv_apple(str.substring(1));
            }
        }

    public static void main(String[] args) {
        String str = "tilappleak";
        System.out.println(rmv_apple(str));
    }
}
