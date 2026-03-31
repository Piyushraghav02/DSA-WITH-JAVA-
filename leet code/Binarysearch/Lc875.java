import java.util.Arrays;

public class Lc875 {
    
    public static long findhrs(int piles[], int rate) {
        long totalhours = 0;

        for (int i = 0; i < piles.length; i++) {
            totalhours += (piles[i] + rate - 1) / rate;
        }
        return totalhours;
    }
    
    public static int minEatingSpeed(int[] piles, int h) {
        
        int low = 1, high = Arrays.stream(piles).max().getAsInt();
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalhours = findhrs(piles, mid);
            
            if (totalhours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    public static void main(String[] args) {
        
        int piles[] = { 3, 6, 7, 11 };
        
        System.out.println("This is the minimum time of eat all bananas :- "+minEatingSpeed(piles, 8));
    }
}
