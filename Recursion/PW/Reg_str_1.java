import java.util.ArrayList;

public class Reg_str_1 {
    static ArrayList<String> allrell(String s){
        ArrayList<String> arr = new ArrayList<>();
        if(s.length()==0){
            arr.add(" ");
            return arr;
        }

        char a = s.charAt(0);
        ArrayList<String> small = allrell(s.substring(1));
        for(String t:small){
            arr.add(t);
            arr.add(a+t);
        } 
         return arr;

    }
    static void printallrel(String s){
        if(s.length()==0){
            System.out.println(" ");
            return;
        }
        char =
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(allrell(s));
    }
}
