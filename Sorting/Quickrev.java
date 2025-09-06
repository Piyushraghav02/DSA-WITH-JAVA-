public class Quickrev {

    static void printarr(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int SortArr(int arr[], int low, int high) {

        int pivot = arr[low];
        low = low + 1;

        while (low <= high) {

            if (low <= high && arr[low] <= pivot)
                low++;

            if (high > low && arr[high] >= pivot)
                high--;

            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }

        }
        int temp = arr[pivot];
        arr[pivot] = arr[high];
        arr[high] = temp;

        return high;
    }

    static void Quicksort(int arr[], int low, int high) {

        if (low < high) {
            int pivot = SortArr(arr, low, high);
            Quicksort(arr, low, pivot - 1);
            Quicksort(arr, pivot + 1, high);
        }

    }

    public static void main(String[] args) {
        int nums[] = { 7, 13, 8, 5, 10, 2, 4 };

        Quicksort(nums, 0, nums.length - 1);

        printarr(nums);
    }
}
