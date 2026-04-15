import java.util.ArrayList;
import java.util.List;

public class Lc46 {
    
    private static void calpermute(int[] nums, int i, ArrayList curr, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        //pick
        curr.add(nums[i]);
        calpermute(nums, i + 1, curr, ans);
        
        //not pick
        curr.remove(curr.size() - 1);
        calpermute(nums, i+1, curr, ans);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        calpermute(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        List<List<Integer>> ans = permute(nums);

        for (List<Integer> list : ans) {
            System.out.print(list);
        }
    }
}
