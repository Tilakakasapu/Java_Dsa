public class bubble_sort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean chng = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    chng = true;
                }
            }
            if(!chng){
                return;
            }
        }
    }
    static void print_arr(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int array[]= {3,5,2,4,6};
        sort(array);
        print_arr(array);


    }
}
