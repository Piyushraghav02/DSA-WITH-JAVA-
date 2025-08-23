class arrrecur {

    static void printarr(int arr[], int ind) {

        if (ind == arr.length) {
            return;

        }
        System.out.println(arr[ind]);
        printarr(arr, ind + 1);
    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 8 };

        printarr(arr, 0);

    }
}