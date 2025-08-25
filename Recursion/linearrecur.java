public class linearrecur {
    static boolean linearecur(int nums[], int ind, int tar) {
        if (ind == nums.length)
            return false;

        if (nums[ind] == tar)
            return true;

        return linearecur(nums, ind + 1, tar);

    }

    public static void main(String[] args) {

        int nums[] = { 2, 5, 6, 8, 3, 4 };

        if (linearecur(nums, 0, 8))
            System.out.println("yes its found");

        else
            System.out.println("its not found");
    }
}
