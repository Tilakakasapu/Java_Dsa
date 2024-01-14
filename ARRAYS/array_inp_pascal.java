import java.util.Scanner;

public class array_inp_pascal {
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
    System.out.println("enter the no of rows and columns: ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int[][] mat1 = new int[r1][c1];
    System.out.println("enter "+r1*c1+" elements");
    int toprow = 0;
    int bottomrow = r1-1;
        int leftcol = 0;
        int rigthcol = c1-1;
        int total_elements = 0;
        while(total_elements < r1*c1){
            // top row left to right
            for(int i = leftcol;i<=rigthcol && total_elements < r1*c1;i++){
                mat1[toprow][i] = sc.nextInt();
                total_elements++;
            }
            toprow++;
            // right col top to bottom
            for(int j = toprow;j<=bottomrow && total_elements < r1*c1;j++){
                mat1[j][rigthcol] = sc.nextInt();
                total_elements++;
            }
            rigthcol--;
            // bottom row rigth to left
            for(int k = rigthcol;k>=leftcol && total_elements < r1*c1;k--){
                mat1[bottomrow][k] = sc.nextInt();
                total_elements++;
            }
            bottomrow--;
             for(int l = bottomrow;l>=toprow && total_elements < r1*c1;l--){
                mat1[l][leftcol] = sc.nextInt();
                total_elements++;
            }
            leftcol++;
        }
        print_arr(mat1);
    }
}
