public class cycle_sort{
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    static void sort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }

        }
        display(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
    }
    
}