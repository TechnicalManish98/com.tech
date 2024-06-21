package datastructures.linkedlist;

public class LinkenedList {

    Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    private void add(int index, int data) {
        Node newNode = new Node(data);
        Node tempNode = head;
        for (int i=0; i<index-1; i++) {
            tempNode = tempNode.next;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    private void addFirst(int data) {
        Node tempNode = head;
        head = new Node(data);
        head.next = tempNode;
    }

    private  void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkenedList linkenedList = new LinkenedList();
        linkenedList.add(20);
        linkenedList.add(30);
        linkenedList.add(40);
        linkenedList.add(50);
        System.out.println("Linkedlist after inserting elements :");
        linkenedList.print();
        System.out.println();
        linkenedList.addFirst(10);
        System.out.println("Linkedlist after inserting elements at first :");
        linkenedList.print();
        System.out.println();
        linkenedList.add(2, 25);
        System.out.println("Linkedlist after inserting elements at 2nd position :");
        linkenedList.print();


    }


}
