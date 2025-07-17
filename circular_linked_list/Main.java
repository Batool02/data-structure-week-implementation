package circular_linked_list;


public class Main {
    public static void main(String[] args) {
        MyCircularList myCircle = new MyCircularList();
        myCircle.insertStart(99);

        myCircle.insertEnd(10);
        myCircle.insertEnd(20);

        myCircle.insertEnd(30);
        myCircle.insertEnd(40);
        myCircle.insertEnd(50);


        System.out.println("The index for 30 = " + myCircle.locateIndex(30));

        System.out.println("The index for 4 = " + myCircle.locateIndex(4));
        System.out.println("Size of the list: " + myCircle.totalNodesCount());

        myCircle.showAll();

    }
}

