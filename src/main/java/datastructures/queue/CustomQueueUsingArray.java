package datastructures.queue;

public class CustomQueueUsingArray {

    int []queueArray;
    int front;
    int rear;

    CustomQueueUsingArray(int size) {
        queueArray = new int[size];
        front = -1;
        rear = -1;
    }

    private void add(int i) {
        if (rear < queueArray.length-1) {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queueArray[front] = i;
            } else {
                rear = rear + 1;
                queueArray[rear] = i;
            }
        } else {
            System.out.println("Queue is full");
        }
    }

    private void peek() {
        System.out.println(queueArray[front]);
    }

    private void poll() {
        int data = queueArray[front];
        front = front + 1;
        System.out.println(data);
    }


    private void printQueue() {
        for (int i=front; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
    }

    public static void main(String[] args) {

        CustomQueueUsingArray customQueueUsingArray = new CustomQueueUsingArray(4);
        customQueueUsingArray.add(10);
        customQueueUsingArray.add(20);
        customQueueUsingArray.add(30);
        customQueueUsingArray.add(40);

        customQueueUsingArray.printQueue();
        System.out.println();
        customQueueUsingArray.peek();
        System.out.println();
        customQueueUsingArray.poll();
        System.out.println();
        customQueueUsingArray.printQueue();

    }



}
