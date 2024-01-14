class problems_1 {
    static int sum_rec(int i){
        if(i==0){
            return 0;
        }
        int s = i%10 + sum_rec(i/10);
        return s;
    }
    static int count_rec(int i){
        if(i >=0 && i<=9){
            return 1;
        }
        int c = 1 + count_rec(i/10);
        return c;
    }
    static int pow_rec(int p,int q){
        if(q==1){
            return p;
        }
        int s = p*pow_rec(p,q-1);
        return s;
    }
    public static void main(String[] args) {
        int i =34552;
        System.out.println(sum_rec(i));
        System.out.println(count_rec(9));
        System.out.println(pow_rec(5, 6));
    }
    
}
