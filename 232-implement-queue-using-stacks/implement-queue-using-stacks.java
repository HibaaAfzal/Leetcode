import java.util.Stack;

class MyQueue {

    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    // Push element to back of queue
    public void push(int x) {
        in.push(x);
    }

    // Removes element from front of queue
    public int pop() {
        peek();            // ensure out stack has elements
        return out.pop();
    }

    // Get front element
    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
