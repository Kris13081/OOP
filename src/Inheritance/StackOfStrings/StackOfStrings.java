package Inheritance.StackOfStrings;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackOfStrings {
    private Deque<String> data;

    public StackOfStrings() {
        this.data = new ArrayDeque<>();
    }

    public void push(String element) {
        data.push(element);
    }

    public String pop() {
        return data.pop();
    }

    public String peek() {
        return data.peek();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
