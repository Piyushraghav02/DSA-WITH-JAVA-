public class Lc345revvowels {
   
   
    public static Boolean isvowel(char ch) {
    

        if (ch == 'e' || ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;

        return false;
   }
   public static String reverseVowels(String s) {
       int n = s.length();

       int high = n - 1, low = 0;
       char arr[] = s.toCharArray();

       while(low<high){

           if (isvowel(s.charAt(low)) && isvowel(s.charAt(high))) {
               
               char temp = arr[low];
               arr[low] = arr[high];
               arr[high] = temp;
               low++;
               high--;
            }
           if (!isvowel(s.charAt(low))) {
               low++;
           }
           if(!isvowel(s.charAt(high))){
               high--;
        }
        
       }
       return s;
   }
    public static void main(String[] args) {
        String str = "Leetcode";
        System.out.println(reverseVowels(str));
    }
}
