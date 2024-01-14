public class Selection_Sort{
    static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    static void print_arr(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,2,9,1};
        selection_sort(arr);
        print_arr(arr);
    }
}