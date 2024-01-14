public class arrays4 {
    static void rotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j =0;
        for (int i =n-k;i<n;i++){
            ans[j++] = arr[i];
        }
        for(int i =0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        for(int i:ans){
        System.out.println(i);
       }
    
    }
    static void swap(int[] arr , int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void reverse_inplace(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, n-k, n);
    }
    public static void main(String[] args) {
    //reversing the array
    //    int[] arr = {1,2,3,43,5,6,8,7};
    //    for (int i =0;i<(arr.length)/2;i++){
    //     int temp = arr[arr.length-1-i];
    //     arr[arr.length-1-i] = arr[i];
    //     arr[i] = temp;
    //    }
    //    for(int i:arr){
    //     System.out.println(i);
    // }
    int[] arr ={1,2,3,4,5,6,7};
    rotate(arr, 5);       



    }
    
}
