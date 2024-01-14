public class dummy {
    static int infinite(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            end = end + (end-start)*2;
            start = temp;
            System.out.println("start updating:" + start);
            System.out.println("end updating " + end);
        }
        int ans = binary_Search(target, arr,start,end);
        return ans;}
    static int binary_Search(int target,int [] arr,int st,int end){
        // int st = 0;
        // int end = arr.length -1;
        if(target>arr[end]){return -1;}
        while(st<=end){
            int mid = st+(end-st)/2;
            if(target< arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                 st = mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {2,4,5,6,7,7,7,9,14,16};
        int ans = infinite(arr,16);
        System.out.println(ans);

}
}
