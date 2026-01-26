public class Lc283movezeros {
    
    public static void moveZeroes(int[] nums) {
        
        int n=nums.length-1;

        int j = 0;

        for (int i = 0; i <=n; i++) {

            if (nums[i] != 0) {
                nums[j++] = nums[i];
               
            }
        }
        for (int k = j; k <=n; k++) {
            nums[k] = 0;
            
        }
        }
    
    
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };

moveZeroes(nums);

    }
}
