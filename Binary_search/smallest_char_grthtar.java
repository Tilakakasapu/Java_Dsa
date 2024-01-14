public class smallest_char_grthtar {
        static int ceiling(int target,int [] arr){
            int st = 0;
            int end = arr.length -1;
            if(target>=arr[end]){return 0;}
            while(st<=end){
                int mid = st+(end-st)/2;
                if(target< arr[mid]){
                    end = mid-1;
                }
                else{
                    return mid+1;
                }
    
            }
            return st;
        } 
        
        public static void main(String[] args) {
         int arr[] = {2,3,5,9,15,16,18};
         int f = ceiling(18,arr) ;
        //  int c = floor(13,arr);
         System.out.println(arr[f]);  
        //  System.out.println(arr[c]);
         System.out.println("completed");
        
    }
}
