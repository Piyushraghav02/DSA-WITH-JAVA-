
import java.util.HashMap;

public class validanagram {
    
    private HashMap<Character, Integer> Makefreqmap(String str) {
        
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                mp.put(ch, mp.get(ch) + 1);
            }
        }
        return mp;
    }
    
    
    public boolean isanagram(String S, String T) {

        HashMap<Character, Integer> mp1 = Makefreqmap(T);

        HashMap<Character, Integer> mp2 = Makefreqmap(S);

        return mp1.equals(mp2);
    }

    public static void main(String[] args) {
    validanagram hm=new validanagram();
        
        String s1 = "Knee";
        String s2 = "Keenn";

        System.out.println("Is both String is Anagram :- "+hm.isanagram(s1, s2));
        
    }
}
