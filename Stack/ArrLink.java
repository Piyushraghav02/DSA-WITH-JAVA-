public class ArrLink {
        
    public static class Stack {
        private int[] arr = new int[5];

        private int idx = -1;
       
        public void Push(int x) {
       
            if (idx == arr.length - 1) {
                System.out.println("Overflow stack");
            }
            else {
                arr[++idx] = x;
            }
        }

        public void Pop(int x) {
            
            if (idx == -1) {
                System.out.println(" Underflow");
            }
            else {
                int val = arr[--idx];
                
        }
        }


        public void Display() {
            if (idx == -1) {
                System.out.println("Stack is empty");
            } else {

                for (int i = 0; i <= idx; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        
        public boolean Isempty() {

            if (idx == -1) {
                System.out.println("Stack is Underflow");
                return true;
            }
            return false;
        }
        
        public boolean Isfull() {

            if (idx == arr.length-1) {
                System.out.println("Stack is Overflow");
                return true;
            }
            return false;
        }
        
}
    
    
    public static void main(String[] args) {
        Stack s = new Stack();
        // s.Push(1);
        // s.Push(2);
        // s.Push(3);
        // s.Push(4);
        // s.Push(5);
        s.Display();
        System.out.println(s.Isempty());
        

        
    }
}
