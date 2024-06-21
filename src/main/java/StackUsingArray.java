public class StackUsingArray {

    int[] arr;
    int top = -1;

    StackUsingArray(int arraySize) {
        arr = new int[arraySize];
    }

    private void push(int i) {
        if (!isFull()) {
            arr[top + 1] = i;
            top++;
        } else {
            System.out.println("Stack is full");
        }
    }

    private int pop() {
        if (!isEmpty()) {
            int popElement =  arr[top];
            arr[top] = 0;
            top--;
            return popElement;
        } else {
            System.out.println("Stack is Empty");
        }
        return -1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == arr.length - 1;
    }

    private boolean printStack() {
        if(!isEmpty()) {
            for (int i=0; i<arr.length; i++) {
                System.out.println(arr);
            }

        } else {
            System.out.println("Stack is empty");
        }
        return top == arr.length - 1;
    }


    public static void main(String[] args) {

        StackUsingArray stackUsingArray = new StackUsingArray(5);
        stackUsingArray.push(1);
        stackUsingArray.push(2);
        stackUsingArray.push(3);
        stackUsingArray.push(4);
        stackUsingArray.push(5);
        stackUsingArray.pop();

        stackUsingArray.printStack();

    }


}
