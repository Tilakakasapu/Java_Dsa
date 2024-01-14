public class R1 {
    static void print_rec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        else{
            print_rec(n-1);
            System.out.println(n);
            
        }
    }
    public static void main(String[] args) {
        print_rec(5);
    }
}
