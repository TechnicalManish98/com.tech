package datastructures.stack;

import java.util.LinkedList;

public class SortedStack {

    private LinkedList<Integer> stack;

    public SortedStack() {
        stack = new LinkedList<>();
    }

    // Method to push an item while maintaining sorted order
    public void push(int value) {
        LinkedList<Integer> temp = new LinkedList<>();
        // Transfer elements to the temporary stack until the right spot is found
        while (!stack.isEmpty() && stack.peek() < value) {
            temp.push(stack.pop());
        }
        // Insert the new value
        stack.push(value);
        // Transfer back the elements
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    // Method to pop an item from the stack
    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.pop();
    }

    // Method to peek the top item of the stack
    public int peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peek();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Method to print the stack elements
    public void printStack() {
        System.out.println(stack);
    }

    public static void main(String[] args) {
        SortedStack sortedStack = new SortedStack();

        sortedStack.push(5);
        sortedStack.push(1);
        sortedStack.push(3);
        sortedStack.push(2);
        sortedStack.push(4);

        System.out.println("Stack after pushing elements:");
        sortedStack.printStack();

        System.out.println("Top element: " + sortedStack.peek());

        sortedStack.pop();
        System.out.println("Stack after popping the top element:");
        sortedStack.printStack();
    }
}
