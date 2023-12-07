//Interstion Lists Y

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Two_Seven_IntersectionLists {
    // Method to append a new node with a given value to the end of the list
    public static ListNode append(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;
    }

    // Method to find the intersection point of two linked lists
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA;
    }

    // Method to print the values of the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the first linked list
        ListNode headA = null;
        headA = append(headA, 4);
        headA = append(headA, 1);
        headA = append(headA, 8);
        headA = append(headA, 4);
        headA = append(headA, 5);

        // Create the second linked list
        ListNode headB = null;
        headB = append(headB, 5);
        headB = append(headB, 6);
        headB = append(headB, 1);
        headB = append(headB, 8);
        headB = append(headB, 4);
        headB = append(headB, 5);

        // Print the linked lists
        System.out.println("Linked List A: ");
        printList(headA);
        System.out.println("Linked List B: ");
        printList(headB);

        // Find the intersection point
        ListNode intersectionNode = getIntersectionNode(headA, headB);

        // Print the result
        if (intersectionNode != null) {
            System.out.println("Intersection point value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection point found.");
        }
    }
}
