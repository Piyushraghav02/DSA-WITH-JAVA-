import java.util.HashMap;
import java.util.Map;

public class Lc1248countnopfnicesub {
    
    
    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;

        int low = 0, count = 0, totlsub = 0;

        Map<Integer, Integer> hm = new HashMap<>();

        for (int high = 0; high < n; high++) {

            hm.put(nums[high] % 2, hm.getOrDefault(nums[high] % 2, 0) + 1);

            if (hm.containsKey(1) && hm.get(1) <= k) {
                count++;
            } else {
                if(count==k)
                    totlsub++;
            }

            while (count == k && low <= high) {
                hm.put(nums[high] % 2, hm.getOrDefault(nums[high] % 2, 0) - 1);
                low++;
            }
        }
        return totlsub;
    }
    
    
    public static void main(String[] args) {
    
        


    }
}
