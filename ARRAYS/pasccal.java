import java.util.Scanner;
public class pasccal {
    static void print_arr(int[][] arr){
        System.out.println("ARRAY :");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j+"  ");
            }
System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for(int i =0;i<n;i++){
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            for(int j=1;j<i;j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
         print_arr(arr);
        

        
    }
}
