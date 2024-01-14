import java.util.Scanner;
public class rectangle{
    static void print_arr(int[][] arr){
        System.out.println("ARRAY :");
        for (int[] i : arr) {
            for (int j : i){
                System.out.print(j+"  ");
            }
System.out.println("");
        }
    }
    static void findsum(int[][] arr, int r1,int c1,int r2,int c2){
        int sum = 0;
        for(int i =r1;i<=r2;i++){
            for(int j =c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("the sum of the given dimensions is "+sum);

    }
    static void prefix_matrix_row(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
         for(int j =0;j<c;j++){
            for(int i=1; i < r ;i++){
               arr[i][j]+=arr[i-1][j];
            }
        }
       
    }
    static void prefix_matrix(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for(int i =0;i<r;i++){
            for(int j=1; j < c ;j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        
    }
    static void findsum3(int[][] arr, int r1,int c1,int r2,int c2 ){
        prefix_matrix(arr);
        prefix_matrix_row(arr); 
        int sum =0,up=0,left=0,upleft = 0,act=0;
        System.out.println(r2);
        System.out.println(c2);
        act =arr[r2][c2];
        if(r1>=1){up = arr[r1-1][c2];}
        if(c1>=1){left = arr[r2][c1-1];}
        if(r1>=1&&c1>=1){upleft = arr[r1-1][c1-1];}
        
        sum = act - up-left+upleft;
        System.out.println(sum);
    }
    static void findsum2(int[][] arr, int r1,int c1,int r2,int c2 ){
        prefix_matrix(arr);
        int sum = 0;
        for(int i =r1;i<=r2;i++){
            if(c1>0)
            sum += arr[i][c2] - arr[i][c1-1];
            else
            sum += arr[i][c2];
        }
        System.out.println("the sum of the given dimensions is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat1 = new int[r][c];
        System.out.println("enter "+r*c+" elements");
        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                mat1[i][j] = sc.nextInt();
             }
        }
        // input complete
        System.out.println("enter the dimensions of the rectangle you want the sum: ");
        int r1 = sc.nextInt();
        int l1 =sc.nextInt();
        int r2 = sc.nextInt();
        int l2 =sc.nextInt();
         findsum(mat1, r1, l1, r2, l2);
        //  findsum2(mat1, r1, l1, r2, l2);
         findsum3(mat1, r1, l1, r2, l2);
        prefix_matrix(mat1);

    }
}