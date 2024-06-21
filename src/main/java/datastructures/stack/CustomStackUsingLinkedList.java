package datastructures.stack;

public class CustomStackUsingLinkedList {

    Node top = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void push(int i) {
        Node newNode = new Node(i);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    private int peek() {
        return top.data;
    }

    private int pop() {
        int d = top.data;
        top = top.next;
        return d;
    }

    private void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args) {

        CustomStackUsingLinkedList customStackUsingLinkedList = new CustomStackUsingLinkedList();
        customStackUsingLinkedList.push(1);
        customStackUsingLinkedList.push(2);
        customStackUsingLinkedList.push(3);
        customStackUsingLinkedList.push(4);

        customStackUsingLinkedList.printStack();

        System.out.println("--------------------------");

        System.out.println(customStackUsingLinkedList.peek());

        System.out.println("--------------------------");

        System.out.println(customStackUsingLinkedList.pop());

        System.out.println("--------------------------");

        customStackUsingLinkedList.printStack();

    }



}
