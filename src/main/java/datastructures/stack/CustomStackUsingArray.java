package datastructures.stack;

import java.util.Arrays;

public class CustomStackUsingArray {

    int []stackArr;
    int top;
    int size;

    CustomStackUsingArray(int arraySize) {
        stackArr = new int[arraySize];
        top = -1;
        size = arraySize;
    }

    private void push(int i) {
        if(!isFull()) {
            top++;
            stackArr[top] = i;
        } else {
            System.out.println("Stack is full");
        }
    }

    private int peek() {
        if(!isEmpty()) {
            return stackArr[top];
        } else {
            System.out.println("Stack is empty");
            return top;
        }
    }

    private int pop() {
        if(!isEmpty()) {
            int i = stackArr[top];
            stackArr[top] = 0;
            top--;
            return i;
        } else {
            System.out.println("Stack is empty");
            return top;
        }
    }

    private boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if (top < size-1){
            return false;
        }
        return true;
    }

    private void printStack() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            Arrays.stream(stackArr).forEach(a -> System.out.print(a+" "));
        }
    }

    public static void main(String[] args) {
        CustomStackUsingArray customStackUsingArray = new CustomStackUsingArray(5);
        customStackUsingArray.push(1);
        customStackUsingArray.push(2);
        customStackUsingArray.push(3);

        /*int peek = customStack.peek();
        System.out.println(peek);*/
        customStackUsingArray.printStack();
        customStackUsingArray.pop();
        System.out.println();
        customStackUsingArray.printStack();
        // customStack.printStack();

    }




}
