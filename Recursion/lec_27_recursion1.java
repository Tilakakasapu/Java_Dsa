public class lec_27_recursion1{
    static int no_of_zeros(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){count = count +1;}
        return no_of_zeros(n/10, count);

    }
    public static void main(String[] args) {
        int zeros = no_of_zeros(300000,0);
        System.out.println(zeros);
    }
}