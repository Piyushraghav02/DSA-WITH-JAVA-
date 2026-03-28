import java.util.HashSet;
import java.util.Set;

public class practice {
    
    public static boolean isvowel(char ch) {
        
        if (ch == 'e' || ch == 'a' || ch == 'o' || ch == 'i' || ch == 'u') {
            return true;

        }
        return false;
    }

    public static int maxVowels(String s, int k) {
        int n = s.length();
        int low = 0, maxvowels = 0;

        Set<Character> hs = new HashSet<>();
        
        int currvow = 0;
        
        for (int high = 0; high < n; high++) {
            char ch = s.charAt(high);

            while (hs.size() > k) {

                if (isvowel(s.charAt(low))) {
                    currvow--;
                }
                hs.remove(s.charAt(low));
            }

            if (isvowel(ch)) {
                currvow++;
            }

            hs.add(ch);
            maxvowels = Math.max(maxvowels, currvow);
        }
        return maxvowels;

    }
    
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("Maximum vowel in substring is :-"+maxVowels(s, 3));

    }
}
