package datastructures.linkedlist;

public class LinkedListIndexReplace {

    private static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Node linkedListFromArray = createLinkedListFromArray(arr);
        System.out.println(linkedListFromArray);
        Node node = swapKthElementfromLinkedList(linkedListFromArray, 2);

        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }

    }

    private static Node swapKthElementfromLinkedList(Node linkedList, int indexFromFrontAndBack) {

        int length = 0;
        Node testNode = linkedList;
        while(testNode != null) {
            length++;
            testNode = testNode.next;
        }

        Node nodeFromFront = linkedList;
        for (int i=1; i< indexFromFrontAndBack; i++) {
            nodeFromFront = nodeFromFront.next;
        }


        Node nodeFromBack = null;
        Node testNode3 = linkedList;
        for (int j=0; j<= length-indexFromFrontAndBack; j++) {
            nodeFromBack = testNode3;
            testNode3 = testNode3.next;
        }

        int temp = nodeFromFront.data;
        nodeFromFront.data = nodeFromBack.data;
        nodeFromBack.data = temp;


        return linkedList;
    }

    private static Node createLinkedListFromArray(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node current = head;

        for(int i=1; i<arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
/*        int i = 0;
        Node node = null;
        while (i < arr.length) {
            if (node != null) {
                Node newNode = new Node(arr[i], null);
                node.next = newNode;
                node = node.next;
            } else {
                node = new Node(arr[i], null);
            }
            i++;
        }
        return node;*/
    }
}
