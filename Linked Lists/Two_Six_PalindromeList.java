//Palindrome: Implement a function to check if a linked list is a palindrome. 

import java.util.Stack;

public class Two_Six_PalindromeList {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 5, 1, 9, 1 };
        Node head = convert2LL(arr);
        // boolean ans = isPalindrome(head);
        boolean ans = isPalindromeByStack(head);
        if (ans == true) {
            System.out.println("Palindrome List");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindromeByStack(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        //odd numbers in list
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            int top = stack.pop();
            if (top != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    private static boolean isPalindrome(Node head) {
        Node current = head;
        int number = 0;
        while (current != null) {
            number = number * 10 + current.data;
            current = current.next;
        }
        int rev = 0, n = number;
        while (number > 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        if (n != rev) {
            return false;
        }
        return true;
    }

    private static Node convert2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }
}
