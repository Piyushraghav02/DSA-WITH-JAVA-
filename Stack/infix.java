import java.util.*;


public class infix {
    
    
    public int Findinfix(String str) {
        
        Stack<Integer> num = new Stack();

        Stack<Character> op = new Stack();
    
        for (int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);

            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57) {
                num.push(ascii-48);
            }
            else if (op.size() == 0)
                op.push(ch);
            else {
                if (op.peek() == '-' || op.peek() == '+') {
                    int val2 = num.pop();
                    int val1 = num.pop();
                    int operator = (int) op.peek();

                    num.push(val2 - val1);
                }
                else {
                    
                }
            }

        }
        
    }
        
    public static void main(String[] args) {
        
        String st = "4-3+2*4/6";
        System.out.println(st);

    }
}
