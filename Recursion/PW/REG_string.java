// import javax.print.DocFlavor.STRING;
// import javax.sound.midi.Soundbank;

public class REG_string {
    static String removeA(String s,int idx){
        if(idx>=s.length()){
            return "";
        }
        String smallans  =removeA(s, idx+1);
        if(s.charAt(idx)!='a'){
            return s.charAt(idx)+smallans;
        }
        else{
            return smallans;
        }
    }
    static String rev(String s,int i){
        if(i == s.length()-1){
            return s.charAt(i)+"";
        }
        String t = rev(s,i+1)+s.charAt(i);
        return t;

    }
    static String ISPALENDROME(String s,int i){
        if(i == s.length()-1){
            return s.charAt(i)+"";
        }
        String t = ISPALENDROME(s,i+1)+s.charAt(i);
        if(i==0){
            if(s.equals(t)){
                System.out.println("Palendrome");
            }
            else{
                
                System.out.println("not a palendrome");
            }
        }
        return t;

    }
    static String Ispalendrome2(String s){

        if(s.length()==0){
            return "";
        }
        String small_ans = Ispalendrome2(s.substring(1))+ s.charAt(0);
        if(s.equals(small_ans)){
            System.out.println("palendrome");
        }
        return small_ans;
    }
    static boolean Ispalendrome3(String s){
        if(s.length()==1){
            return true;
        }
        if(s.charAt(0)==s.charAt(-1)){
            return Ispalendrome3(s.substring(1,-1));
        }
        else{
            return false;
        }

    }
    static boolean Ispalendrome4(String s,int l,int r){
        if(l==r){
            return true;
        }
        if(s.charAt(l)==s.charAt(r)){
            return Ispalendrome4(s,l+1,r-1);
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        String s = "madam";
        // System.out.println(removeA(s, 0));
        // System.out.println(rev(s,0));
        // ISPALENDROME(s, 0);
        // System.out.println(ISPALENDROME(s, 0));
        // Ispalendrome2(s);
        if(Ispalendrome4(s,0,s.length()-1)){

            System.out.println("palendrome");
        }
        else{
            System.out.println("not a palendrome");
        }
        
    }
}
