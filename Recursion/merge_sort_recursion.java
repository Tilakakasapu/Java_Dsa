// import java.util.Arrays;

// public class merge_sort_recursion {
//     static int[] merge_sort(int[] arr){
//         if (arr.length==1){
//             return arr;
//         }
//         int mid = arr.length/2;
//         int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
//         int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));
//         int[] merged = merge(left,right);
//         return merged;

//     }
//     static int[] merge(int[] left,int[] right){
//         int[] arr1  = new int[left.length + right.length];
//         int i=0,j=0,k=0;
//         while(i<left.length&&j<right.length){
//             if(left[i]<right[j]){
//                 arr1[k] = left[i];
//                 i++;k++;
//             }
//             else if(left[i]>right[j]){
//                 arr1[k] = right[j];
//                 j++;k++;
//             }
//         }
//         while(i<left.length){
//             arr1[k++] = left[i++];
//         }
//         while(j<right.length){
//             arr1[k++] = right[j++];
//         }
//         return arr1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {4,3,2,1};
//         int[] ans= merge_sort(arr);
//         System.out.println(Arrays.toString(ans));
        
//     }
// }
import java.util.Arrays;

public class merge_sort_recursion {
    static void merge_sort(int[] arr, int s,int e){
        if(e-s+1==1){
            return;
        }
        int mid = s + (e-s)/2;
        merge_sort(arr, s, mid);
        merge_sort(arr, mid+1, e);
        mergeInplace(arr,s,mid,e);
    }
    static void mergeInplace(int[] arr,int s,int mid,int e){
        int i=s,j=mid+1;
        int[] arr1 = new int[e-s+1];
        int k =0;
        while(i<=mid && j<e+1){
            if(arr[i]<arr[j]){
                arr1[k++] = arr[i];
                i++;
            }
            else if(arr[j]<arr[i]){
                arr1[k++]=arr[j];
                j++;
            }
        }
        while(i<=mid){
            arr1[k++] = arr[i++];
        }
        while(j<e+1){
            arr1[k++] = arr[j++];
        }
        for(int l=0;l<arr1.length;l++){
            arr[s+l] = arr1[l];
        }
    }
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        merge_sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}

