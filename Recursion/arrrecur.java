class arrrecur {

    static void printarr(int arr[], int ind) {

        if (ind == arr.length) {
            return;

        }
        System.out.println(arr[ind]);
        printarr(arr, ind + 1);
    }

    static int calmax(int arr[], int ind) {

        if (ind == arr.length - 1) {
            return arr[ind];
        }

        int max = calmax(arr, ind + 1);
        if (max < arr[ind]) {

            max = arr[ind];
        }
        return max;

    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 10, 7, 8 };

        System.out.println(calmax(arr, 0));

        // printarr(arr, 0);

    }
}