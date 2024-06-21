package datastructures.linkedlist;

public class CircularLinkedList {

    Node head = null;
    Node tail = null;

    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    public void add(int index, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            for (int i=0; i<index-1; i++) {
                temp = temp.next;
            }
            Node tempNode = temp.next;
            temp.next = newNode;
            newNode.next = tempNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    public int get(int index) {
        Node temp = head;
        for (int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void remove(int index) {
        Node temp = head;
        Node ptr = temp.next;
        for (int i=0; i<index-1; i++) {
            temp = temp.next;
            ptr = ptr.next;
        }
        temp.next = ptr.next;

    }


    void printLinkedList() {

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while (temp != head);
    }

    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);
        circularLinkedList.add(2);
        circularLinkedList.add(3);
        circularLinkedList.add(4);
        circularLinkedList.addFirst(0);
        circularLinkedList.addLast(5);
        circularLinkedList.printLinkedList();
        System.out.println();
        circularLinkedList.add(2, 100);
        circularLinkedList.printLinkedList();
        System.out.println();
        circularLinkedList.add(4, 200);
        circularLinkedList.printLinkedList();

        System.out.println();
        int i = circularLinkedList.get(2);
        System.out.println(i);
        circularLinkedList.remove(3);
        System.out.println();
        circularLinkedList.printLinkedList();


    }
}
