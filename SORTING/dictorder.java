// public class prblm {
//     static void bubble_sort(int[] arr){
//         int n = arr.length;
//         for(int i =0;i<n-1;i++){
//             for(int j =0;j<n-i-1;j++){
//                 if(arr[j]==0 && arr[j+1]!=0){
//                     int temp =arr[j];
//                     arr[j]= arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {0,5,0,3,42};
//         bubble_sort(arr);
//         for (int i : arr) {
//             System.out.println(i);
//         }
//     }
// }

// --------------------------------------------------------------
public class dictorder{
    static void sort_fruits(String[] fruits){
        int n = fruits.length;
        for(int i =0;i<n-1;i++){
            int min_index = i;
            for(int j = i+1;j<n;j++){
                if((fruits[j].compareTo(fruits[min_index])<0)){
                    min_index = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        String[] fruits = {"kiwi","apple","papaya","mango"};
        sort_fruits(fruits);
        for (String string : fruits) {
            System.out.println(string);
        }
    }
}