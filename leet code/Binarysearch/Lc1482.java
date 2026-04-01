import java.util.Arrays;

public class Lc1482 {
    
    public static boolean possible(int bloomday[], int day, int m, int k) {
        int count = 0, noofbouqhet = 0;

        for (int i = 0; i < bloomday.length; i++) {
            if (bloomday[i] <= day) {
                count++;
            } else {
                noofbouqhet += (count / k);
                count = 0;                      //This is brute force
            }
        }
        noofbouqhet += (count / k);

        if (noofbouqhet == m) {
            return true;
        } else {
            return false;
        }
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        
        int min = Arrays.stream(bloomDay).min().getAsInt();
        int max = Arrays.stream(bloomDay).max().getAsInt();

        if (m * k > n) {
            return -1;
        }
        for (int i = min; i < max; i++) {

            if (possible(bloomDay, i, m, k) == true) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {

        int bloomDay[] = { 7, 7, 7, 7, 12, 7, 7 };

        System.out.println(minDays(bloomDay, 2, 3));

    }
}