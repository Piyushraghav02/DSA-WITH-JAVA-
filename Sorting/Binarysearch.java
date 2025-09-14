class Binarysearch {

    static int Searchele(int arr[], int low, int high, int tar) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        if (arr[mid] > tar) {
            return Searchele(arr, low, mid - 1, tar);
        }
        if (arr[mid] < tar) {
            return Searchele(arr, mid + 1, high, tar);
        }

        return -1;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println(Searchele(nums, 0, nums.length - 1, 4));
    }
}