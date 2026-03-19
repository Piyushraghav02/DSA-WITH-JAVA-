

public class sizemaxheight {
    
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static int size(Node root) {
        if (root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);

    }
     
    public static int Findsum(Node root) {
        if (root == null)
            return 0;

        return root.val + Findsum(root.left) + Findsum(root.right);
    }

    public static int Findmax(Node root) {
        if (root == null)
            return 0;

        int a = root.val;
        int b = Findmax(root.left);
        int c = Findmax(root.right);

        return Math.max(a, Math.max(b, c));

    }
    
    public static void main(String[] args) {
        
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.left = b;
        a.right = c;

        Node d = new Node(4);
        Node e = new Node(5);
        
        b.left = d;
        b.right = e;

        Node f = new Node(6);
        
        c.right = f;

        System.out.println("Size of tree is :- " + size(a));
     
        System.out.println(" Sum of tree is :- " + Findsum(a));

        System.out.println(" Max of this tree :- "+Findmax(a));
    
    }
}
