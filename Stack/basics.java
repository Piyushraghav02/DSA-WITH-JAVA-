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
        
        Stack<Integer> st2 = new Stack<>();
        while (st.size() > 0) {
            st2.push(st.pop());
        }
        System.out.println(st2);
    }
}
