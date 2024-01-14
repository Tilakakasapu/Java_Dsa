import java.util.Arrays;

public class lecture_29_recursion{
    static void pattern1(int n){
     // ****
    // ***
    // **
    // *
        if(n==1){
            System.out.println("*");
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println("");
        pattern1(n-1);
    }
    static void pattern1_method2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern1_method2(r, c+1);
        }
        else{
            System.out.println();
            pattern1_method2(r-1, 0);
        }
    }
    static void bubblesort(int[] arr,int r,int c){
        if(r==0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubblesort(arr, r, c+1);
        }
        else{
            bubblesort(arr, r-1, 0);
        }
    }
    static void pattern2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            pattern2(r, c+1);
            System.out.println("*");
        }
        else{
            pattern2(r-1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        System.out.println("");
        pattern1_method2(4, 0);
        int[] arr ={4,3,2,1};
        bubblesort(arr, arr.length-1, 0);
        
    }
}