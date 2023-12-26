class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Three_Two_MinStack {
    static Node topOne, topTwo; // Make topTwo static
    static Three_Two_MinStack stackTwo = new Three_Two_MinStack(); // Initialize stackTwo

    public static void main(String[] args) {
        Three_Two_MinStack stackOne = new Three_Two_MinStack();

        stackOne.push(22);
        stackOne.push(-2);
        stackOne.push(7);
        stackOne.push(-125);
        stackOne.push(626);
        stackOne.push(0);
        stackOne.pop();
        stackOne.pop();
        stackOne.pop();
        int poppedValue = stackOne.pop();
        System.out.println("Minimum value " + stackTwo.peek());
    }

    int peek() {
        if (stackTwo.isEmpty()) {
            return -1; // or handle the case when stackTwo is empty
        }
        return stackTwo.topTwo.data;
    }

    int pop() {
        if (isEmpty()) {
            return -1;
        }
        int poppedValue = topOne.data;
        topOne = topOne.next;
        if (!stackTwo.isEmpty() && stackTwo.topTwo.data == poppedValue) {
            stackTwo.topTwo = stackTwo.topTwo.next;
        }
        return poppedValue;
    }

    boolean isEmpty() {
        return topOne == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            topOne = newNode;
            topTwo = newNode;
        } else {
            newNode.next = topOne;
            topOne = newNode;
            if (data <= topTwo.data) {
                Node newMinNode = new Node(data);
                newMinNode.next = topTwo;
                topTwo = newMinNode;
            }
        }
    }
}
