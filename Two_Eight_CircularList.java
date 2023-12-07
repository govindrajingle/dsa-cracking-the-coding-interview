class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Two_Eight_CircularList {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7 };
        Node head = convert2LinkedList(arr);
        if (isCircularList(head)) {
            System.out.println("circular list");
        } else {
            System.out.println("not a circular list");
        }
    }

    private static boolean isCircularList(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node current = head;
        while (current != null) {
            Node runner = head;
            while (runner != null) {
                if (current == runner && current != head) {
                    return true; // Detected a cycle
                }
                runner = runner.next;
            }
            current = current.next;
        }

        return false; // No cycle detected
    }

    private static Node convert2LinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }
}
