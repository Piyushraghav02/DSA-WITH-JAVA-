public class Lc283movezeros {
    
    public static void moveZeroes(int[] nums) {

        int n = nums.length ;

        int i = -1;

        // for (int i = 0; i <=n; i++) {

        //     if (nums[i] != 0) {
        //         nums[j++] = nums[i];
                                                //O(n) time complexity
        //     }
        // }
        // for (int k = j; k <=n; k++) {
        //     nums[k] = 0;

        // }
        // }




        for (int k = 0; k < n; k++){
            if (nums[k] == 0) {
                i = k;
                break;
            }
        }
        for (int j = i+1; j < n; j++) {
            
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }


        for (Object elem : nums) {
            System.out.print(elem+" ");
        }
    }
    
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };

moveZeroes(nums);

    }
}
