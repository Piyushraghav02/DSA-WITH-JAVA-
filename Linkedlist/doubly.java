class doubly{
    
    class Node{
        int data;
        Node prev;
        Node next;
        
        public Node (int data){
            this.data=data;
        }
    }
    
    public static Node Start,End;
    public int size;

    public void Addfirst(int data){
        
        size++;
        
        Node head=new Node(data);

        if(Start==null){
            Start=End=head;
            return;
        }

        head.next=Start;
        Start.prev=head;
        Start=head;
    }

    public void AddLast(int data){

        size++;
        
        Node head=new Node(data);

        if(Start==null){
            Start=End=head;
            return;
        }

        Node temp=Start;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;
        head.next=null;
        End=head;

    }
    
    public void Addmiddle(int data,int index){

        size++;//Everytime we enter in method it will increase
        
        Node head=new Node(data);

        if(Start==null){
            Start=End=head;
            return;
        }


    }
    
    public void Display(Node Start){

        if(Start==null){
            System.out.print("Doubly linked list is empty");
        }
        
        System.out.print("Display the nodes :- ");
        Node temp=Start;
        while(temp!=null){
            System.out.print(+temp.data+"->");
            temp=temp.next;
        }
    }


    public void ReverseDisplay(Node End){

        if(Start==null){
            System.out.print("Doubly linked list is empty");
        }
            System.out.print("Display the reverse :-");
        Node temp=End;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
        
        doubly DL=new doubly();

        DL.AddLast(1);
        DL.AddLast(2);
        DL.AddLast(3);
        DL.AddLast(4);
        DL.Display(Start);
        System.out.println();
        System.out.println("Size of the Doubly linked list :-"+DL.size);
 
        DL.ReverseDisplay(End);
        System.out.println();
    }
}