package Queues;

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
            else
                arr[++rear] = data;
        }

        public int Dequeue() {

            if (size == 0) {
                System.out.println("Queue is underflow");
            }
            front++;
            size--;
            return arr[front - 1];
        }

    }

    

    public static void main(String[] args) {

    }
}
