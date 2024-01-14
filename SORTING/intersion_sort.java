public class intersion_sort {
    static void intersion_sort(int[] arr){
        int n = arr.length;
        for(int i =1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
     int[] arr ={5,2,4,7,2,1,3};
     intersion_sort(arr);
     for (int i : arr) {
        System.out.println(i);
     }   
    }
    
}
// time complexity : Best case:O(n) worstcase: O(n2)
// space complexity : o()