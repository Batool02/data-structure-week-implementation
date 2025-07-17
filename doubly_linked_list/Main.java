package doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        MyDoublyList myList = new MyDoublyList();

        myList.insertLast(10);
        myList.insertLast(20);
        myList.insertLast(30);
        myList.insertLast(40);
        myList.insertLast(50);

        myList.insertAtFront(8);

        System.out.println("Index of 30="+ myList.findPosition(30));
        System.out.println( "Index of 28="+ myList.findPosition(28));

        myList.printList();;

        System.out.println("Items in list: " + myList.countItems());
    }
}
