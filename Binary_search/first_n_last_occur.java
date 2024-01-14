public class first_n_last_occur {
    // static int[] first_lst(int arr[],int target){
    //    int[] ans = {-1,-1};
    //    ans[0]= search(arr,target,true);
    //     ans[1]= search(arr,target,false);       
    //    return ans;
    // }
    // static int search(int[] arr,int target,boolean isfirstoccurance){
    //     int start = 0,ans=-1;
    //     int end = arr.length-1;
    //     while(start<=end){
    //         int mid = start + (end-start)/2;
    //         if(target>arr[mid]){
    //             start = mid+1;
    //         }
    //         else if(target<arr[mid]){
    //             end = mid-1;
    //         }
    //         else{
    //             ans = mid;
    //             if(isfirstoccurance){
    //                 end=mid-1;
    //             }
    //             else{
    //                 start = mid+1;
    //             }
    //         }
    //     }
    //     return ans;
    // }



    static int infinite(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            end = end + (end-start)*2;
            start = temp;
        }
        int ans = binary_Search(target, arr,start,end);
        return ans;
    }
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
