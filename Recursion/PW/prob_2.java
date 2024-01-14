class prob_2{
    static int alt_sum(int n){
        if (n==1){
            return 1;
        }
        int s;
        if(n%2==0){
            s = -1*n + alt_sum(n-1); 
        }
        else{
             s = n+alt_sum(n-1);
        }
        
        return s;
    }
    public static void main(String[] args) {
        
        System.out.println(alt_sum(10));
    }
}