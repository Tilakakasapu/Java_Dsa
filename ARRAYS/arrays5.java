// import java.util.Scanner;
public class arrays5 {
    static void printarray(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortzerosandones(int[] arr){
        int zeros = 0;
        int n = arr.length;
        for (int i : arr) {
            if (i ==0){
                zeros++;
            }
        }
        for(int i =0;i<zeros;i++){
            arr[i]=0;
        }
        for(int i =zeros;i<n;i++){
            arr[i]=1;

        }

    }
    static void sortonesandzeros(int[] arr){
        int n = arr.length;
        int left =0;
        int right = n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right] ==1){
                right--;
            }

        }
        
    }
    static void oddandeven(int[] arr){
        int n = arr.length;
        int left = 0;
        int rigth = n-1;
        while(left<rigth){
            if(arr[left]%2==1 && arr[rigth]%2==0){
                swap(arr, left, rigth);
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[rigth]%2==1){
                rigth--;
            }
        }    
    }    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        // sortonesandzeros(arr);
        oddandeven(arr);
        printarray(arr);
    }
    
}
