import java.util.*;

public class basics {
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int ind = 2;
        int val = 6;

        Stack<Integer> st2 = new Stack<>();
        
        while (st.size() >ind) {
            st2.push(st.pop());
        }
        st.push(val);

        while (st2.size() > 0) {
            st.push(st2.pop());
        }
        System.out.println(st);
        
    }
}
