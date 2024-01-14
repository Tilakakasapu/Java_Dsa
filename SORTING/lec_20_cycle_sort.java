public class lec_20_cycle_sort{
    static int[] cycle_sort(int[] arr){
        int i =0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
                swap(arr,i,arr[i]);
            }
            else{
                i++;
            }
        }
        return arr;
    }
        static int[] cycle_sort_1(int[] arr){
        int i =0;
        while(i<arr.length){
            if(arr[i]!=(arr[arr[i]-1])){
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }
        return arr;
    }



    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        // int[] arr = {4,0,2,1};
        // arr = cycle_sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!= i){
        //         System.out.println("the missing number is :" + i);
        //         break;
        //     }
        // }

         int[] arr = {1,1};
         arr = cycle_sort_1(arr);
         for(int i=0;i<arr.length;i++){
            if(i+1 != arr[i]){
                System.out.println(arr[i]+"  "+(i+1));
            }
         }
        
    }
}