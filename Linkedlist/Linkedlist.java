
public class Linkedlist {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node Start, End;// initalize the Pointer which is type of Node (hold the add of nodes)

    public void Addfirst(int data) {
        Node head = new Node(data); // This is ADD First Method

        if (Start == null) {
            Start = End = head;
            return;
        } else {
            head.next = Start;
            Start = head;
            System.out.println("Node Inserted succesfully");
        }
    }

    public void AddMiddle(int data, int ind) {
        Node head = new Node(data);

        if (Start == null) {
            Start = End = head;
        } else {
            Node temp = Start;

            for (int i = 0; i < ind - 1; i++) {
                temp = temp.next;
            }
            head.next = temp.next;
            temp.next = head;
        }
    }

    public void Addlast(int data) {
        Node head = new Node(data); // This is Insert LAST Method

        if (Start == null) {
            Start = End = head;
            return;
        } else {
            End.next = head;
            End = head;
        }
    }

    public void Display(Node Start) {
        if (Start == null) {
            System.out.println("Linked list is Empty");
        } else {
            Node temp = Start;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

        }

    }

    public static void main(String[] args) {

        Linkedlist LL = new Linkedlist();

        LL.Addfirst(10);
        LL.Addfirst(5);
        LL.Addlast(20);
        LL.AddMiddle(8, 1);
        LL.Display(Start);
    }
}
