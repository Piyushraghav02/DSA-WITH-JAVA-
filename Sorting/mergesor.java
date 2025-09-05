public class mergesor {
    static void printarr(int arr22[]) {

        for (int i = 0; i < arr22.length - 1; i++) {
            System.out.print(arr22[i] + " ");
        }

    }

    static void mergesubarr(int arr[], int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];

            } else {
                temp[k++] = arr[j++];
            }
        }

        // for the first half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // for the Second half
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        printarr(temp);
    }

    static void Mergesort(int nums[], int low, int high) {

        if (low >= high)
            return;

        int mid = (low + high) / 2;

        // First half
        Mergesort(nums, low, mid);

        // Second half
        Mergesort(nums, mid + 1, high);

        mergesubarr(nums, low, mid, high);

    }

    public static void main(String[] args) {

        int nums[] = { 7, 20, 4, 11, 8, 2 };
        System.out.println("This is before sorting");
        printarr(nums);
        System.out.println();
        System.out.println("This is after sorting");
        Mergesort(nums, 0, nums.length - 1);
    }
}
