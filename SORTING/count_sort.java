public class count_sort {
    static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
    static int maxof(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void basiccount(int[] arr){
        int max = maxof(arr);
        int[] count = new int[max+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k =0;
        for(int i =0;i<count.length;i++){
            for(int j=count[i];j>0;j--){
                arr[k++] = i;
            }
        }
    }
    static void countsort(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int max = maxof(arr);
        int[] count = new int[max+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;    
        }
        for(int i =1;i<count.length;i++){
            count[i] += count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx = count[arr[i]]-1;
            ans[idx] = arr[i];
            count[arr[i]]--;
        }
        for(int i =0;i<arr.length;i++){
            arr[i] = ans[i];
        }

    }   
  public static void main(String[] args) {
        int[] arr ={7,5,2,4,2,1};
        countsort(arr);
        display(arr);
    }
}