public class Lc80removedupII {
    
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int k = 2;

        for (int i = 2; i < n; i++) {

            if (nums[k] != nums[i]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    
    
    public static void main(String[] args) {

        
        int nums[] = { 1, 1, 1, 2, 2, 2, 3, 4 };
    
        System.out.println(removeDuplicates(nums));
    
    }
}
