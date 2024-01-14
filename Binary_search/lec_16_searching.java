// import java.util.Arrays;
// public class lec_16_searching{
//     static int[] search(int[][] arr, int target){
//         int rows = 0;
//         int col = arr.length-1;
//         while(rows<arr.length&&col>=0){
//             if(arr[rows][col] == target){
//                 return new int[]{rows,col};
//             }
//             if(arr[rows][col]<target){
//                 rows++;
//             }
//             else{
//                 col--;
//             }
//         }
//         return new int[] {-1,-1};


//     }
//     public static void main(String[] args) {
//         int[][] arr = {{10,20,30,40},
//         {15,25,35,45},
//         {28,29,37,49},
//         {33,34,38,50}};
//         int[] ans = search(arr,35);
//        System.out.println(Arrays.toString(ans));
//     }
// }




//Q2 search in sorted matrix:

// import java.util.Arrays;

// public class lec_16_searching{
//     static int[] search(int[][] arr,int target){
//     int rows = arr.length-1 ;
//     for(int i=0;i<=rows;i++){
//         if(arr[i][arr[i].length-1]>=target){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j]==target){
//                     return new int[]{i,j};
//                 }
//             }
//         }
//     }
//     return new int[]{-1,-1};
// }
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         System.out.println(Arrays.toString(search(arr,11)));
//     }
// } 



// Q2 better answer

import java.util.Arrays;

public class lec_16_searching{
    static int[] binarysearch(int[][] arr,int row,int scol,int ecol,int target){
        while(scol<=ecol){
            int mid = (scol+ecol)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<target){
                scol = mid+1;
            }
            else{
                ecol = mid-1;
            }
        }
        return new int[]{-1,-1};

    }
    static int[] search(int[][] arr,int target){
        int rows = arr.length;
        int cols = arr[0].length;
        if(rows==1){
            return binarysearch(arr, 0, 0, cols-1, target);
        }
        int rstart = 0;
        int rend = rows-1;
        int cmid = cols/2;
        while(rstart<(rend-1)){
            int mid = (rstart+rend)/2;
            if(arr[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if(arr[mid][cmid]<target){
                rstart =mid;
            }
            else{
                rend = mid-1;
            }
        }
        if(arr[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        else if(arr[rstart][cmid-1]>=target){
            return binarysearch(arr, rstart, 0, cmid-1, target);
        }
        else if(arr[rstart][cmid+1]<=target){
            return binarysearch(arr, rstart, cmid+1, cols-1, target);
        }
        else if(arr[rstart+1][cmid-1]>=target){
            return binarysearch(arr, rstart+1, 0, cmid-1, target);
        }
        else{
            return binarysearch(arr, rstart+1, cmid+1, cols-1, target);
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(search(arr, 11)));
    }
}