public class Lc80finddupII {
    
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;


        int low = 2;

        for (int high = 2; high < n; high++) {

            if (nums[low-2] != nums[high]) {
                nums[low] = nums[high];
                low++;
            }
        }
        
        return low;
        
    }
   
    public static void main(String[] args) {
        int num[] = { 1, 1, 1, 2, 2, 3 };
removeDuplicates(num);

    }
}
