
import java.util.HashSet;
import java.util.Set;

public class Lc3_longsubstringoutrepeat {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int maxlen = Integer.MIN_VALUE, low = 0;
        
        Set<Character> set = new HashSet<Character>();

        for (int high = 0; high < n; high++) {
            char ch = s.charAt(high);

            while (set.contains(ch)) {
                set.remove(s.charAt(low));
                low++;
            }
            set.add(ch);
            maxlen = Math.max(maxlen, high - low + 1);

        }
        return maxlen;
    
    }




    public static void main(String[] args) {
        String str = "abcabcbb";

        System.out.println("This is the longest substring :- "+lengthOfLongestSubstring(str));
    }
}
