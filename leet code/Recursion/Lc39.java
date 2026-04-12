import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lc39 {
    
    public static HashSet<List<Integer>> hs = new HashSet<>();

    public static void calcombinationsum(int arr[],int i,List<Integer> l,List<List<Integer>> ans,int tar){

        if(i==arr.length || tar<0)return;
        if (tar == 0) {
            if (!hs.contains(l)) {
                ans.add(new ArrayList<>(l));
                hs.add(l);
           }
            return;
       }
        //for the single inclusion 
        l.add(arr[i]);
        calcombinationsum(arr,i+1,l,ans,tar-arr[i]);
    
        //for multiple execlution
         calcombinationsum(arr,i,l,ans,tar-arr[i]);
    
        //for the exclustion
        l.remove(l.size()-1);
        calcombinationsum(arr,i+1,l,ans,tar);
    
       }

       public static List<List<Integer>> combinationSum(int[] candidates, int target) {
       
        List<Integer> curr = new ArrayList<>();   
        List<List<Integer>> ans = new ArrayList<>();

        calcombinationsum(candidates, 0, curr, ans, target);
        return ans;

       }
    public static void main(String[] args) {
        int nums[] = { 2, 3, 5 };

        List<List<Integer>> ans= combinationSum(nums, 8);
        System.out.println(ans);

    }
}