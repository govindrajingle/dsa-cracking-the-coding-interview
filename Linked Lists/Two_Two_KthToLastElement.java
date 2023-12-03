// Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list. 

public class Two_Two_KthToLastElement {
    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55 };
        Node head = convertToLinkedList(arr);
        // KthToLast(head, 2);
        Node kn = KthToLastTwoPointer(head, 2);
        display(kn);
    }

    private static void display(Node kn) {
        Node current = kn;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private static Node KthToLastTwoPointer(Node head, int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i <= k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            // System.out.print(fast.data + " ");
            slow = slow.next;
            fast = fast.next;
        }
        // System.out.println(fast);
        // System.out.println(slow);
        return slow;
    }

    private static int findLength(Node head) {
        if (head == null) {
            return 0;
        }
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    private static void KthToLast(Node head, int k) {
        int length = findLength(head);
        Node current = head;
        if (length == 0) {
            System.exit(0);
        }
        for (int i = 0; i < k; i++) {
            current = current.next;
        }
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    private static Node convertToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            // System.out.println(current.data);
            current = current.next;
        }
        return head;
    }
}