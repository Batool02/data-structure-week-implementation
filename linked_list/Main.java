package linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insertAtBeginning(50);


        myList.insertAtEnd(5);
        myList.insertAtEnd(18);
        myList.insertAtEnd(24);
        myList.insertAtEnd(4);
        myList.insertAtEnd(10);
        myList.insertAtEnd(30);



        System.out.println("Index of value 25: " + myList.findIndex(24));

        System.out.println("Index of value 0: " + myList.findIndex(0));

        System.out.println("Value at index 2= " + myList.getValue(2));

        Integer removed = myList.deleteAt(3);
        System.out.println("Removed value at index 3= " + removed);

        myList.display();

        System.out.println("Size of the list = " + myList.getSize());
    }
}
