public class arrays3 {
    static void pair_sum(int[] arr,int sum){
        int c=0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k = j+1;k<arr.length;k++){
                     if(arr[i]+arr[j]+arr[k] == sum){
                    c++;
                }
                }
            }
        }
        System.out.println("the no of triplets that have the sum "+sum+" is : "+ c);
    }
    static void unique(int[] arr){
        
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i] = arr[j] = -1;
                }
            }
        }
        for(int i:arr){
            if(i>0){
                System.out.println(i);
            }
        }
    }
    static void nth_max(int[] arr,int n){
        int mx = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            for (int j=0;j<arr.length;j++) {
                if(arr[j]==mx){
                    arr[j] = Integer.MIN_VALUE;
                }
            }
            mx = Integer.MIN_VALUE;
        for(int k = 0; k < arr.length;k++){
            if(arr[k]>mx){
                mx=arr[k];
            }
        }
        }
        System.out.println("the "+n+"th maximum in the array is :" + mx);

    }
    static void first_repeating(int[] arr){
        int r = -1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    r = arr[i];
                    break;
                }

            }
            if(r!=-1){
                break;
            }
        }
        System.out.println("first repeating value in the array is : " +r);

    }
    

    
    public static void main(String[] args){
        int[] arr = {1,1,89,22,24,57,57,2,5,7,8,8,4,6,4,6};
        //int sum =12;
        // pair_sum(arr, sum);
        unique(arr);
        // nth_max(arr, 2);
        // first_repeating(arr);
    }
    
}
