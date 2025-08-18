public class trappingwater {

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

    public static void main(String args[]) {

        int height[] = { 2, 3, 4, 6, 2, 5, 18 };

        System.out.println(trappingwate(height));
    }
}
