import java.util.Scanner;
public class arrays_pascal{
    static void print_arr(int[][] arr){
        System.out.println("ARRAY :");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j+"  ");
            }
        System.out.println("");
        }
    }
    static void print_arr_spiral(int[][] arr,int r1,int c1){
        int toprow = 0;
        int bottomrow = r1-1;
        int leftcol = 0;
        int rigthcol = c1-1;
        int total_elements = 0;
        int a = 1;



        while(total_elements < r1*c1){
            // top row left to right
            for(int i = leftcol;i<=rigthcol && total_elements < r1*c1;i++){
                arr[toprow][i]=a;
                total_elements++;
            }
            toprow++;
            // right col top to bottom
            for(int j = toprow;j<=bottomrow && total_elements < r1*c1;j++){
                arr[j][rigthcol]=a;
        
                total_elements++;
            }
            rigthcol--;
            // bottom row rigth to left
            for(int k = rigthcol;k>=leftcol && total_elements < r1*c1;k--){
                arr[bottomrow][k]=a;
                total_elements++;
            }
            bottomrow--;
            for(int l = bottomrow;l>=toprow && total_elements < r1*c1;l--){
                arr[l][leftcol] =a;
                total_elements++;
            }
            leftcol++;
            a++;
        }
        print_arr(arr);

        //  toprow = 0;
        //  bottomrow = r1-1;
        //  leftcol = 0;
        //  rigthcol = c1-1;
        //  total_elements = 0;

        // while(total_elements < r1*c1){
        //     // top row left to right
        //     for(int i = leftcol;i<=rigthcol && total_elements < r1*c1;i++){
        //         System.out.print(arr[toprow][i]+ "  ");
        //         total_elements++;
        //     }
        //     toprow++;
        //     // right col top to bottom
        //     for(int j = toprow;j<=bottomrow && total_elements < r1*c1;j++){
        //         System.out.print(arr[j][rigthcol]+"  ");
        //         total_elements++;
        //     }
        //     rigthcol--;
        //     // bottom row rigth to left
        //     for(int k = rigthcol;k>=leftcol && total_elements < r1*c1;k--){
        //         System.out.print(arr[bottomrow][k]+" ");
        //         total_elements++;
        //     }
        //     bottomrow--;
        //     for(int l = bottomrow;l>=toprow && total_elements < r1*c1;l--){
        //         System.out.print(arr[l][leftcol] + " ");
        //         total_elements++;
        //     }
        //     leftcol++;
        // }

    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of rows and columns: ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int[][] mat1 = new int[r1][c1];     
     print_arr_spiral(mat1, r1, c1);
    }
}