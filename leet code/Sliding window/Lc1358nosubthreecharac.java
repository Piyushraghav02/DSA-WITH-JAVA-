import java.util.HashMap;
import java.util.Map;

public class Lc1358nosubthreecharac {
    
    public static int numberOfSubstrings(String s) {
        
        int n = s.length();

        int low = 0, count = 0;
        Map<Character, Integer> hm = new HashMap<>();

        for (int high = 0; high < n; high++) {
            char ch = s.charAt(high);

            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            while (hm.size() >= 3) {
                count += n - high;
                hm.put(s.charAt(low), hm.get(s.charAt(low)) - 1);
                if (hm.get(s.charAt(low)) == 0) {
                    hm.remove(s.charAt(low));
                }
                low++;
            }
            
        }
        return count;
        
    }
    
    public static void main(String[] args) {
        String s = "aaabc";

        System.out.print(numberOfSubstrings(s));
    }
}
