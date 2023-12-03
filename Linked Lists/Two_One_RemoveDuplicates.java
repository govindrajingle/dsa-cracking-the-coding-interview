import java.util.HashMap;

public class Two_One_RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 11, 33, 44, 22, 11, 33, 55 };
        Node head = convert2LinkedList(arr);
        System.out.println("Original Linked List:");
        showList(head);

        Node newList = removeDuplicates(head);
        System.out.println("\nLinked List after Removing Duplicates:");
        showList(newList);
    }

    private static void showList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node removeDuplicates(Node head) {
        Node current = head;
        Node prev = null;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (current != null) {
            map.put(current.data, map.getOrDefault(current.data, 0) + 1);

            if (map.get(current.data) > 1) {
                // Remove the current node
                prev.next = current.next;
            } else {
                prev = current;
            }

            current = current.next;
        }
        return head;
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

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
