//Add two numbers represented by Linked List

//Given two numbers represented by two lists, write a function that returns the sum in the form of a linked list.

// Input: 
// List1: 5->6->3 // represents number 563 
// List2: 8->4->2 // represents number 842 
// Output: 
// Resultant list: 1->4->0->5 // represents number 1405 
// Explanation: 563 + 842 = 1405

// Input: 
// List1: 7->5->9->4->6 // represents number 75946
// List2: 8->4 // represents number 84
// Output: 
// Resultant list: 7->6->0->3->0// represents number 76030
// Explanation: 75946+84=76030

public class Two_Five_SumLists {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 0, 5 };
        int brr[] = { 5 };
        Node headFirst = convert2LinkedList(arr);
        Node headSecond = convert2LinkedList(brr);
        int sumOne = sumOfList(headFirst);
        int sumTwo = sumOfList(headSecond);
        int result = sumOne + sumTwo;
        int temp = result;
        int digits = 0;
        while (result > 0) {
            digits++;
            result /= 10;
        }
        int resultArray[] = new int[digits];
        for (int i = digits - 1; i >= 0; i--) {
            resultArray[i] = temp % 10;
            temp = temp / 10;
        }
        Node ansHead = convert2LinkedList(resultArray);
        while (ansHead != null) {
            System.out.print(ansHead.data + " ");
            ansHead = ansHead.next;
        }
    }

    private static int sumOfList(Node head) {
        int temp = 0;
        Node current = head;
        while (current != null) {
            temp = temp * 10 + current.data;
            current = current.next;
        }
        return temp;
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
