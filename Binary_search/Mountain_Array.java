public class Mountain_Array {
    static int peak(int[] arr){
        int start = 0;
        int end=arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if (arr[mid]>arr[mid+1]) {
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }            
        }
        return start;

    }
    public static void main(String[] args) {
        int[] arr ={1,3,5,8,5,3,1};
        int a =peak(arr);
        System.out.println(arr[a]);
    }
    
}
