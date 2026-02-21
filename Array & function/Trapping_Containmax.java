public class Trapping_Containmax{

    public static int trappingwate(int[] height) {
        int n = height.length;
        // auxiliary array
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            // for calculate Leftmax bar
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            // for calculate rightmax bar
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trapped = 0;
        // For calcualate trapped water
        for (int i = 0; i < n; i++) {
            int waterlev = Math.min(rightmax[i], leftmax[i]);

            trapped += (waterlev - height[i]);
        }

        return trapped;
    }

    public static int Containmax(int arr[]) {

        int n = arr.length - 1;

        int low = 0, high = n;

        int maxwater = Integer.MIN_VALUE;

        while (low <= high) {

            int minheight = Math.min(arr[low], arr[high]);

            int currwater = (high - low) * minheight;

            maxwater = Math.max(currwater, maxwater);

            if (arr[low] < arr[high]) {
                low++;
            } else {
                high--;
            }
        }

        return maxwater;
    }


    public static int maxArea(int[] height) {
        int n = height.length;

        int low = 0, high = n - 1;

        int maxwater=Integer.MIN_VALUE;
        while (low <=high)
        {
            int minheight = Math.min(height[low], height[high]);

            int currwater = (high-low) * minheight;

            maxwater = Math.max(currwater, maxwater);

            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxwater;
    
    }

    public static void main(String args[]) {

        //int height[] = { 2, 3, 4, 6, 2, 5, 18 };

        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println("Maximum water is :- "+maxArea(height));
    }
}
