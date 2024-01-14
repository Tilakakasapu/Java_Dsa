import java.util.ArrayList;

public class phone_number_string {
    static void phone_Str(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = Character.getNumericValue(up.charAt(0));
        for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
            phone_Str(p + String.valueOf((char) ('a' + i)), up.substring(1));
        }
    }

    static ArrayList<String> phone_Str_list(String p, String up) {
        if (up.isEmpty()) {
            // System.out.println(p);
            ArrayList<String> a1 = new ArrayList<>();
            a1.add(p);
            return a1;
        }
        ArrayList<String> a2 = new ArrayList<>();
        int digit = Character.getNumericValue(up.charAt(0));
        if(digit==7){
            for (int i = (digit - 2) * 3; i < ((digit - 1) * 3)+1; i++){
                a2.addAll(phone_Str_list(p + String.valueOf((char)('a' + i)), up.substring(1)));
            }
        }
        else if(digit==8){
            for (int i = (digit - 2) * 3 +1; i < (digit - 1) * 3+1; i++){
                a2.addAll(phone_Str_list(p + String.valueOf((char)('a' + i)), up.substring(1)));
            }
        }
        else if(digit==9){
            for (int i = (digit - 2) * 3+1; i < (digit - 1) * 3+2; i++){
                a2.addAll(phone_Str_list(p + String.valueOf((char)('a' + i)), up.substring(1)));
            }
        }
        else{
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++){
                a2.addAll(phone_Str_list(p + String.valueOf((char)('a' + i)), up.substring(1)));
            }
        }
        // a2.remove("");
        return a2;
    }

    public static void main(String[] args) {
        System.out.println(phone_Str_list("", ""));
        // String up = "";
        // System.out.println(up.isEmpty());
        // int digit = Character.getNumericValue(up.charAt(0));
        // System.out.println(digit);

    }
}
