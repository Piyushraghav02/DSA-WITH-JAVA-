public class count {

    static void printarr(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int findmax(int arr[]) {
        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    static void Countsort(int arr[]) {
        int max = findmax(arr);

        int[] carr = new int[max];
        int k = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            k = i;
            for (int j = i; j < arr.length - 1; j++) {

                if (arr[j] == i) {
                    count++;
                }

            }
            if (count > 0)
                carr[k++] = count;
            else
                 carr[i] = 0;
        }

        printarr(carr);
    }

    public static void main(String[] args) {
        int arr2[] = { 4, 1, 6, 2, 7, 9, 3, 4, 6, 8, 3, 1, };
        Countsort(arr2);
    }
}
