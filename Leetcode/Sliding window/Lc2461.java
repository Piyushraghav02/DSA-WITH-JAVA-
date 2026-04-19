public class Lc2461 {
    
    
    public static long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;

        Long maxsum = (long) Integer.MIN_VALUE;
        int currsum=0;

        for (int i = 0; i < k; i++) {
            currsum += nums[i];
        }
        maxsum = (long) currsum;

        int low=0;
        for (int high = k; high < n; high++) {
            
            currsum -= nums[low];
            low++;
            if (nums[high] != nums[high -1]) {
                currsum += nums[high];
                maxsum = Math.max(maxsum, currsum);
            } else {
                break;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int nums[] = {1,5,4,2,9,9,9};
        System.out.println(maximumSubarraySum(nums, 3));
    }
}