import java.util.*;

public class Three_Three_StackOfPlates {
    ArrayList<Stack<Integer>> stacks;
    int capacity;

    Three_Three_StackOfPlates(int capacity) {
        this.capacity = capacity;
        this.stacks = new ArrayList<>();
    }

    public static void main(String[] args) {
        Three_Three_StackOfPlates setStacks = new Three_Three_StackOfPlates(3);
        setStacks.push(1);
        setStacks.push(2);
        setStacks.push(31);
        setStacks.push(14);
        setStacks.push(51);
        setStacks.push(15);
        setStacks.push(16);
        setStacks.push(17);
        int poppedValue = setStacks.pop();
        System.out.print(poppedValue);
    }

    void push(int data) {
        Stack<Integer> lastStack = getLastStack();
        if (lastStack != null && lastStack.size() < capacity) {
            lastStack.push(data);
        } else {
            Stack<Integer> newStack = new Stack<>();
            newStack.push(data);
            stacks.add(newStack);
        }
    }

    int pop() {
        Stack<Integer> lastStack = getLastStack();
        if (lastStack == null || lastStack.isEmpty()) {
            throw new EmptyStackException();
        }
        int value = lastStack.pop();
        if (lastStack.isEmpty()) {
            stacks.remove(stacks.size() - 1);
        }
        return value;
    }

    Stack<Integer> getLastStack() {
        if (stacks.isEmpty()) {
            return null;
        }
        return stacks.get(stacks.size() - 1);
    }
}
