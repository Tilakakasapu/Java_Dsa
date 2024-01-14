public class lec_21_strings {
    public static void main(String[] args) {
        String a = "tilakalit";
        StringBuilder build = new StringBuilder();
        for(int i=0;i<a.length();i++){
            build.append(a.charAt(i));
        }
        if (build.toString().equals(a)){
            System.out.println("it is a palendrome");
        }
        else{
            System.out.println("not a palendrome");
            System.out.println(a +" " + build);
        }
    }
}
