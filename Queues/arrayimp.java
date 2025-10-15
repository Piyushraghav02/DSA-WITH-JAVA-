
public class arrayimp {

    public static class Arrqueue {

        int front = -1;
        int rear = -1;
        int size = 0;

        int arr[] = new int[100];

        public void Enqueue(int data) {

            if (rear == arr.length - 1) {
                System.out.println("Queue is overflow");
                return;
            }

            if (front == -1)
                front = rear = 0;
            else {
                arr[++rear] = data;
            }
            size++;
            
        }

        public int Dequeue() {

            if (size == 0) {
                System.out.println("Queue is underflow");
            }
            front++;
            size--;
            return arr[front - 1];
        }

        public int peek() {
            
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            int val = arr[front];
            return val;
        }

        public void Display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            }
            else {
                for (int i = front; i <=rear; i++) {
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {

        Arrqueue q1 = new Arrqueue();

        q1.Enqueue(1);
        q1.Enqueue(2);
        q1.Enqueue(3);                  //Array implementation 
        q1.Enqueue(4);
        q1.Display();



    }
}
