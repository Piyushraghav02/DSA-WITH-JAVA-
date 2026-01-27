public class Lc209minsubarrsum {
    
    public static int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length-1;
        int min = Integer.MIN_VALUE;
    
        for (int i = 0; i < n; i++) {
            int prefixsum = 0;
            for (int j = i ; j < n; j++) {
                
                prefixsum += nums[j];

                min = Math.min(min, j - i);
    
            }
        }
        return min;
    
    }
    
    
    
    public static void main(String[] args) {
        
        int arr[] = { 2, 3, 1, 2, 4, 3 };

        System.out.println(minSubArrayLen(7, arr));
    }
}
