import java.util.Scanner;
public class arrays6 {
    static int get_array_sum(int[] arr){
        int total=0;
        for (int i : arr) {
            total +=i;
        }
        return total;
    }
    static void printarray(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static int[] prefixsum(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        System.out.println("the prefix sum array is: ");
        printarray(arr);
        return arr;

    }
    static boolean arr_seperable(int[] arr){
        int total_sum = get_array_sum(arr);
        int prefix =0;
        for(int i =0;i<arr.length;i++){
            prefix+=arr[i];
            int sufix = total_sum - prefix;
            if(prefix == sufix){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+ n + " elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the array is seperable: "+arr_seperable(arr));
        // int[] arr = {0,1,2,3,4,5};
        // int[] arr1 = prefixsum(arr);
        // System.out.println("enter no of queries: ");
        // int n = sc.nextInt();
        // while (n-- >0){
        //     System.out.println("enteer the range: ");
        //     int l = sc.nextInt();
        //     int r = sc.nextInt();
        //     int sum = arr1[r] - arr1[l-1];
        //     System.out.println(sum);
        

    }
}

