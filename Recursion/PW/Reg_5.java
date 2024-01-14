public class Reg_5 {
    static void print_arr(int[] arr,int i){
        if (i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        print_arr(arr, i+1);
        return ;
    }
    static void max_in_array(int[] arr,int max,int i){

        if(i==arr.length){
            System.out.println(max);
            return;
        }
        if(arr[i]>max){
            max = arr[i];
        }
        max_in_array(arr,max,i+1);
        
    }
    static int sum_of_array(int[] arr,int i,int sum){
        if(i==arr.length){
            return 0 ;
        }
        sum = arr[i]+ sum_of_array(arr, i+1, sum);
        return sum;
    }
    public static void main(String[] args) {
         int[] arr = {3,10,3,2,5};
         int[] arr1 = {5,6,8,3,7};
        //  max_in_array(arr1, arr1[0],0);
        System.out.println(sum_of_array(arr1,0,0));
    }
}
