public class QueueImplementation {
    Node front, rear;

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();
        queue.enqueue(11);
        queue.enqueue(22);
        queue.dequeue();
        System.out.println(queue.toString());
    }

    private void enqueue(int i) {
        Node newNode = new Node(i);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    private void dequeue() {
        if (front == null) {

        } else {
            front = front.next;
        }
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = front;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }
}
