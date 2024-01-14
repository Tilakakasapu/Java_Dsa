// import java.util.Arrays;
// import java.util.Scanner;
public class arrays2{
    static void printarray(int[] arr){
        System.out.println("the elements in the array is :");
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("");
    }
    static void frequency(int[] array,int ele){
        int c = 0;
        for(int i:array){
            if(i==ele){
                c++;
            }
        }
        System.out.println("the number of occurences of the given element is :" + c);
    }
    static void is_sorted(int[] arr){
        boolean is_sorted = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i+1]<arr[i]){
                is_sorted = false;
                break;
            }
            else{
                is_sorted = true;
            }
        }
        if(is_sorted){
            System.out.println("this array is sorted");
        }
        else{
            System.out.println("this array is not sorted");
        }
    }
    static void last_occurence(int[] arr,int ele){
        int c =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                c = i;
            }
        }
        System.out.println("the last occurence of the given element is in the index: "+c);

    }
    static void min_max(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i:arr){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("the smallest element in this array is : "+min);
        System.out.println("the largest element of this array is : "+max);
        
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,1,2,6,1,6,3,1,16,1,2,3};
        // int element = sc.nextInt();
        // frequency(arr,element);
        // last_occurence(arr, element);
        is_sorted(arr);
        min_max(arr);
        // nth_max(arr, 0);

    }
    
}
