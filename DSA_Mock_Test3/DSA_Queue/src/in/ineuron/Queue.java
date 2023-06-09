package in.ineuron;

public class Queue {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;  // points to the front of the queue
    private Node rear;   // points to the rear of the queue

    // Constructor to initialize the queue
    public Queue() {
        front = null;
        rear = null;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (front == null);
    }

    // Method to enqueue (add) an element to the rear of the queue
    public void enqueue(int element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Enqueued element: " + element);
    }

    // Method to dequeue (remove) an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;  // return a default value indicating queue underflow
        }

        int dequeuedElement = front.data;
        front = front.next;

        // If front becomes null, the queue is empty, so update rear to null as well
        if (front == null) {
            rear = null;
        }

        System.out.println("Dequeued element: " + dequeuedElement);
        return dequeuedElement;
    }

    // Method to display the elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue: ");
            Node current = front;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();  // Output: Queue: 10 20 30

        queue.dequeue();  // Output: Dequeued element: 10
        System.out.println("Is queue empty? " + queue.isEmpty());  // Output: Is queue empty? false

        queue.display();  // Output: Queue: 20 30
    }
}

//This code is contributed by Naveen Duggal...