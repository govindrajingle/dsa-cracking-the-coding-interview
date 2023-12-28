import java.util.*;

public class Three_Four_QueueUsingTwoStacks {
    Stack<Integer> stackOne;
    Stack<Integer> stackTwo;

    Three_Four_QueueUsingTwoStacks() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }

    public static void main(String[] args) {
        Three_Four_QueueUsingTwoStacks queue = new Three_Four_QueueUsingTwoStacks();
        queue.enqueue(22);
        queue.enqueue(232);
        queue.enqueue(223);
        queue.dequeue();
    }

    void enqueue(int data) {
        stackOne.push(data);
        if (stackTwo.isEmpty()) {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }
    }

    void dequeue() {
        System.out.println(stackTwo.pop());
    }
}
