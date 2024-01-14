import java.util.Scanner;
public class arrays_2d {
    static void print_arr(int[][] arr){
        System.out.println("ARRAY :");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print("  "+j+"  ");
            }
System.out.println("");
        }
    }
    static void multiple_matrices(int[][] arr1,int r1 , int c1,int[][] arr2,int r2, int c2){
        if(c1!=r2){
            System.out.println("the given arrays cannot be multiplied!!");
        }
        else{
            int[][] multi = new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j =0;j<c2;j++){
                    for(int k =0;k<c1;k++){

                        multi[i][j]+=arr1[i][k]+arr2[k][j];
                    }
                }
            }
            print_arr(multi);
        }

    }
    static void add_matrix(int[][] arr1,int r1 , int c1,int[][] arr2,int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("invalid input please check the input matrices");
        }
        else{
            System.out.println("the Addition of two arrays is : ");
            int[][] sum = new int[r1][c1];
            for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
               sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        print_arr(sum);
        }
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
        System.out.println("MATRIX 2:");
        System.out.println("enter the no of rows and columns: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] mat2 = new int[r1][c1];
        System.out.println("enter "+r1*c1+" elements");
        for(int i =0;i<r2;i++){
            for(int j =0;j<c2;j++){
                mat2[i][j] = sc.nextInt();

            }
        }

        print_arr(mat1);
        print_arr(mat2);
        add_matrix(mat1, r1, c1, mat2, r2, c2);
        multiple_matrices(mat1, r1, c1, mat2, r2, c2);
    }
}
