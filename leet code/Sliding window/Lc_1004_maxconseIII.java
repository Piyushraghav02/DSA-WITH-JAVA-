public class Lc_1004_maxconseIII {
    
    public static int longestOnes(int[] nums, int k) {
        
        int n = nums.length;

        int maxlen = 0;

        for (int i = 0; i < n; i++) {
            int zero = 0;
            for (int j = i; j < n; j++) {

                if (nums[j] == 0)
                    zero++;

                if (zero <= k) {
                    int currlen = j - i + 1;
                    maxlen = Math.max(currlen, maxlen);
                }
            }
        }
        return maxlen;
    }
    
    
    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };

        System.out.println(longestOnes(nums, 2));

    }
}
