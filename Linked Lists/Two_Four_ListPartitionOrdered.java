public class Two_Four_ListPartitionOrdered {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 4, 3, 2, 6, 4, 3 };
        Node head = convertToLinkedList(arr);

        System.out.println("Original Linked List:");
        showList(head);

        Node partitionedNode = partitionList(head, 3);

        System.out.println("\nPartitioned Linked List:");
        showList(partitionedNode);
    }

    private static Node partitionList(Node head, int x) {
        Node smallerHead = null, smallerLast = null;
        Node greaterLast = null, greaterHead = null;
        Node equalHead = null, equalLast = null;

        while (head != null) {
            if (head.data == x) {
                if (equalHead == null)
                    equalHead = equalLast = head;
                else {
                    equalLast.next = head;
                    equalLast = equalLast.next;
                }
            } else if (head.data < x) {
                if (smallerHead == null)
                    smallerLast = smallerHead = head;
                else {
                    smallerLast.next = head;
                    smallerLast = head;
                }
            } else {
                if (greaterHead == null)
                    greaterLast = greaterHead = head;
                else {
                    greaterLast.next = head;
                    greaterLast = head;
                }
            }
            head = head.next;
        }

        if (greaterLast != null)
            greaterLast.next = null;

        if (smallerHead == null) {
            if (equalHead == null)
                return greaterHead;
            equalLast.next = greaterHead;
            return equalHead;
        }

        if (equalHead == null) {
            smallerLast.next = greaterHead;
            return smallerHead;
        }

        smallerLast.next = equalHead;
        equalLast.next = greaterHead;
        return smallerHead;
    }

    private static Node convertToLinkedList(int[] arr) {
        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }

        return head;
    }

    private static void showList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
