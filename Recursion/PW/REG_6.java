import java.util.ArrayList;

public class REG_6 {
    static int is_present(int[] arr,int x,int i,int c){
        
        if(i==arr.length){
            if(c>=1){
                System.out.println("present");
            }
            else{
                System.out.println("not present");
            }
            return 1;
        }
        if(arr[i]==x){
            c = c+1;
        }
        is_present(arr, x, i+1,c);
        return 0;


    }
    static int search(int[] arr,int target,int i){
        if(i>= arr.length) return -1;
        if(arr[i]==target) return i;
        return search(arr, target, i+1);

    }
    static void search_1(int[] arr,int target,int i){
        if(i>=arr.length) return;
        if(arr[i]==target) System.out.println(i);
        search_1(arr, target, i+1);
    }
     static ArrayList<Integer> search_2(int[] arr,int target,int i){
        if(i>=arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr[i] == target){
            ans.add(i);
        }
        ArrayList<Integer> small_ans = search_2(arr, target, i+1);
        ans.addAll(small_ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,5,5,2,5};
        int num = 5;
        // is_present(arr, num, 0, 0);
        search_1(arr, num, 0);
        System.out.println(search_2(arr, num, 0));

    }
}