package queue;


public class Main {
    public static void main(String[] args) {
        System.out.println(" Queue using Array");
        MyQueueArray arrayQueue = new MyQueueArray();

        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);

        System.out.println("Removed: " + arrayQueue.pop());

        System.out.println("Peek: " + arrayQueue.peekFront());
        System.out.println("Contains 2: " + arrayQueue.includes(2));
        System.out.println("Remove 2: " + arrayQueue.removeValue(2));

        arrayQueue.displayQueue();

        System.out.println("Size: " + arrayQueue.length());

        System.out.println("\n Queue Linked List ");
        MyQueueLinkedList linkedQueue = new MyQueueLinkedList();
        linkedQueue.push(10);

        linkedQueue.push(20);
        linkedQueue.push(30);


        System.out.println("Removed: " + linkedQueue.pop());
        System.out.println("Peek: " + linkedQueue.peekFront());

        System.out.println("Contains 20: " + linkedQueue.includes(20));


        System.out.println("Remove 20: " + linkedQueue.removeValue(20));
        linkedQueue.displayQueue();

        System.out.println("Size: " + linkedQueue.length());
    }
}

