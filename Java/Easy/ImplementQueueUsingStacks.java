import java.util.Stack;

class MyQueue {
    Stack<Integer> a;
    Stack<Integer> b;

    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x) {
        a.push(x);

    }

    public int pop() {
        while (!a.isEmpty())
            b.push(a.pop());

        Integer top = b.pop();

        while (!b.isEmpty())
            a.push(b.pop());

        return top;
    }

    public int peek() {
        while (!a.isEmpty())
            b.push(a.pop());

        Integer top = b.peek();

        while (!b.isEmpty())
            a.push(b.pop());

        return top;

    }

    public boolean empty() {
        return a.isEmpty();

    }
}

public class ImplementQueueUsingStacks {

    public static void main(String[] args) {

    }

}