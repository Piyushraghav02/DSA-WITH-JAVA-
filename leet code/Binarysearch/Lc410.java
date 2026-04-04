public class Lc410 {
    
    public static int countsubarr(int arr[], int area) {
        int n = arr.length;

        int count = 1;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum + arr[i] <= area) {
                sum += arr[i];
            } else {
                count++;
                sum = arr[i];
            }
        }
        return count;

    }
    public int splitArray(int[] nums, int k) {
        
    }
    
    
    public static void main(String[] args) {
        
    }
}