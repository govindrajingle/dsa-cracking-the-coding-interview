public class StackImplementation {
    static Node top;

    StackImplementation() {
        this.top = null;
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        stack.push(11);
        stack.push(22);
        // stack.pop();
        stack.peek();
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        System.out.println("peek element is " + top.data);
        return top.data;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
