import java.util.Scanner;
public class array_2d_2 {
    static void print_arr(int[][] arr){
        System.out.println("ARRAY :");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j+"  ");
            }
System.out.println("");
        }
    }


     static void transpose_matrix(int[][] arr,int r1,int c1){
        int[][] trans = new int[c1][r1];
        for(int i =0;i<c1;i++){
            for(int j=0;j<r1;j++){
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println("the transpose matirix without inplace is :");
        print_arr(trans);
        
    }
    static int[][] transpose_matrix_Ret(int[][] arr,int r1,int c1){
        int[][] trans = new int[c1][r1];
        for(int i =0;i<c1;i++){
            for(int j=0;j<r1;j++){
                trans[i][j] = arr[j][i];
            }
        }
       
        return trans;
    }

    static void transpose_matrix_inplace(int[][] arr,int r1,int c1){
        for(int i =0;i<r1;i++){
            for(int j =i;j<c1;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                
            }
        }
        System.out.println("the Transpose matrix is: ");
        print_arr(arr);
    }
    static void reverse_rows_matrix(int[][] arr){
        for (int[] i : arr){
            for(int j=0;j<(i.length/2);j++){
                int temp = i[j];
                i[j] = i[i.length-j-1];
                i[i.length-j-1] = temp;
            }
        }
        print_arr(arr);
    }
    static void rotate(int[][] arr,int r1,int c1){
        int[][] t = transpose_matrix_Ret(arr, r1, c1);
        // transpose_matrix_inplace(mat1, r1, c1);
        reverse_rows_matrix(t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows and columns: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        System.out.println("enter "+r1*c1+" elements");
        for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                mat1[i][j] = sc.nextInt();
             }
        }
         print_arr(mat1);
        rotate(mat1, r1, c1);
        
    }
    
}
