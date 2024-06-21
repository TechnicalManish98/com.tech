package datastructures.linkedlist;

public class DoublyLinkedList {

    Node head = null;
    Node tail = null;

    private static class Node {

        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {

           /* Node temp = head; //If this need to be use tail is not needed
            while (temp.next != null) {
                temp = temp.next;
            }*/
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

    }

    private void add(int index, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            for (int i=1; i< index; i++) {
                temp = temp.next;
            }
            Node tempNode = temp.next;
            temp.next = newNode;
            newNode.next = tempNode;
            newNode.prev = temp;
        }

    }


    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(1);
        doublyLinkedList.add(2);
        doublyLinkedList.add(3);
        doublyLinkedList.add(4);
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        doublyLinkedList.add(3, 100);

        doublyLinkedList.printList();

    }


}