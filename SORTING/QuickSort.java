
public class QuickSort {
    static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
    static int partition(int[] arr,int st,int end){
        int pivot = arr[st];
        int cnt = 0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }
        int pivotidx = st+cnt;
        swap(arr,st,pivotidx);
        int i=0,j=end;
        while(i<pivotidx&&j>pivotidx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<pivotidx&&j>pivotidx){
                swap(arr, i, j);i++;j++;
            }
        }
        return pivotidx;
    }
    static void quicksort(int[] arr,int st,int end){
        if(st<end){
        int pi = partition(arr,st,end);
        quicksort(arr, st, pi-1);
        quicksort(arr, pi+1, end);}
    }
    public static void main(String[] args) {
        int[] arr = {6,3,1,5,4};
        System.out.println(("before sorting"));
        display(arr);
        quicksort(arr,0,arr.length-1);
        System.out.println("after sorting");
        display(arr);
    }
    
}
