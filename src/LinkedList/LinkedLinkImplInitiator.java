package LinkedList;

public class LinkedLinkImplInitiator {
    public static void main(String[] args){
        SinglyLinkedList myLinkedList = new SinglyLinkedList(1);
        myLinkedList.prepend(0);
        myLinkedList.append(2);
        myLinkedList.printLinkedList();
        System.out.println();
        System.out.println("REVERSING THE LINKED LIST");
        myLinkedList.reverse();
        myLinkedList.printLinkedList();

        System.out.println();
        myLinkedList.insert(2,5);
        myLinkedList.printLinkedList();
        System.out.println();
        System.out.println("REVERSING THE LINKED LIST");
        myLinkedList.reverse();
        myLinkedList.printLinkedList();

        System.out.println();
        myLinkedList.remove(1);
        myLinkedList.printLinkedList();


/*
        System.out.println();
        myLinkedList.printDoublyLinkedList();*/

        /*System.out.println();
        myLinkedList.insert(2,5);
        myLinkedList.printLinkedList();

        System.out.println();
        myLinkedList.insert(1,9);
        myLinkedList.printLinkedList();


        //edgecase: insert to head
        System.out.println();
        myLinkedList.insert(0,999);
        myLinkedList.printLinkedList();


        System.out.println();
        myLinkedList.insert(5,1000);
        myLinkedList.printLinkedList();

        System.out.println();
        myLinkedList.printDoublyLinkedList();

        System.out.println();
        myLinkedList.remove(1);
        myLinkedList.printLinkedList();


        System.out.println();
        myLinkedList.remove(5);
        myLinkedList.printLinkedList();

        System.out.println();
        myLinkedList.remove(0);
        myLinkedList.printLinkedList();*/


    }
}
