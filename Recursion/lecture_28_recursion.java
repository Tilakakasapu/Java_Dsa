public class lecture_28_recursion {
    static void is_sorted(int[] arr,int n,int idx){
        if(idx<n-1){
            if(arr[idx]>arr[idx+1]){
            System.out.println("Not sorted");
            return;
        }
        else{
            is_sorted(arr, n, idx+1);
        }   
        }
        else{
            System.out.println("Sorted");
        }
    }

    static int RBS(int[] arr,int target,int s , int e){
        if(s>e){
            return -1;
        }
        int m = (s+e)/2;
        if(arr[m]==target){return m;}
        if(arr[s]<=arr[m]){
            if(target>=arr[s]&&target<=arr[m]){
                return RBS(arr, target, s, m-1);
            }
            else{
                return RBS(arr, target, m+1, e);
            }
        }
        if(arr[m]<=target && arr[e]>=target){
           return RBS(arr, target, m+1, e);
        }
        return RBS(arr, target, s, m-1);
    }

    static void linear_Search(int[] arr,int idx,int target){
        if(idx<arr.length){
            if(arr[idx]==target){
                System.out.println("----Element is found----");
                return;
            }
            else{
                linear_Search(arr, idx+1, target);
            }
        }
        else{
            System.out.println("Element is not found");
        }
    }
    static boolean linear_Search1(int[] arr,int target,int idx){
            if(idx==arr.length){
                return false;
            }
            return arr[idx] == target || linear_Search1(arr, target, idx+1);
    }   
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,7,8,9,10,11,12};
        // is_sorted(arr,arr.length,0);
        // linear_Search(arr, 0, 10);
        // if(linear_Search1(arr, 10, 0)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("not found ");
        // }

        int[] arr1 = {5,6,7,8,9,1,2,3};
        System.out.println(RBS(arr1, 5, 0, arr1.length-1));
    }
}
