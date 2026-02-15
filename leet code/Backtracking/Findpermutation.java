public class Findpermutation {
    
    
    public static void Printarr(String str) {
        for (int i = 0; i < str.length();i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void findpermutation(String str, String ans) {
        
        //Base case
        if (str.length() == 0) {
            Printarr(ans);
            return;
        }

        //Recursion 

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i + 1);
            findpermutation(newstr, ans+curr);
        }

    }

    public static void main(String[] args) {
        String str1 = "abc";
        findpermutation(str1, "");
    }
}
