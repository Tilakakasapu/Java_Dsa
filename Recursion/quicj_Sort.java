import java.lang.reflect.Array;
import java.util.Arrays;

public class quicj_Sort {
    static void quick(int[] arr,int low,int hi){
        if(low>=hi){
            return;
        }
        int mid = low +(hi-low)/2;
        int pivot = arr[mid];
        int s=low,e=hi;
        while(s<=e){
            while(arr[s]<=pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,hi);
    }
 public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    quick(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
 }   
}
