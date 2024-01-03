import java.util.Stack;

public class Three_Five_SortStack {
    public static void main(String[] args) {
        Stack<Integer> oldStack = new Stack<>();
        oldStack.push(3);
        oldStack.push(8);
        oldStack.push(2);
        System.out.println("Original Stack" + oldStack);
        Stack<Integer> r = sort(oldStack);
        System.out.print("Sorted Stack " + r);
    }

    static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<Integer>();
        while (!s.isEmpty()) {
            int temp = s.pop();
            while (!r.isEmpty() && r.peek() > temp) { // not understood
                s.push(r.pop());
            }
            r.push(temp);
        }
        return r;
    }
}
