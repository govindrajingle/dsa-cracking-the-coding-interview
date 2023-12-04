// Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but 
// the first and last node, not necessarily the exact middle) of a singly linked list, given only access to 
// that node. 

public class Two_Three_DeleteMiddleNode {
    public static void main(String[] args) {
        int arr[] = { 11, 22, 33, 44, 55 };
        Node head = convert2LinkedList(arr);
        showList(head);
        System.out.println();
        Node middleNode = deleteMiddleNode(head);
        showList(middleNode);
    }

    private static Node deleteMiddleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }

    private static void showList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private static Node convert2LinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }
}
