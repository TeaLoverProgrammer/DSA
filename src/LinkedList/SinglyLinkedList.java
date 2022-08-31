package LinkedList;

import java.util.Objects;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    SinglyLinkedList(int data){
        head = new Node(data);
        tail = head;
        System.out.println("Constructor: head " +head.data);
        System.out.println("Constructor: tail " +tail.data);
    }

    //add data to the start of the list.
    public Node prepend(int data){
        Node node = new Node(data);


        node.next = head;
        //assiging variable head to the new node.
        head = node;

        //return the current head
        System.out.println("prepend: head data " +head.data);
        System.out.println("prepend: tail " +tail.data );


        return head;

        //tail will remain unchanged in prepend because only head is getting changed. The tail will have the
        //address of the previous head.

        //imagine a number line. at 0 index we created our linkedlist for the first time.
        //head = 0 address, tail = 0 address
        // Created a new node at 5th index. Now this node will be named ad head.  so our linked list would look like
        // 0(tail)    5(head) , the head will then point towards 0 which is our tail.
    }

    //adding data to the last of the list
    public Node append(int  data){
        //We just need to poin the tail to the next node and assign it as the new tail.
        Node node = new Node(data);

        tail.next = node;

        tail = node;
        //tail and head are just identifiers. That is they are just the names.
        System.out.println("append: head " +head.data);
        System.out.println("append: tail " +tail.data);
        return tail;
    }

    public void insert(int index, int value){
        Node newNode = new Node(value);

        //prepend
        if(index == 0){

            newNode.next = this.head;

            // assigning the head identifier with the address of the new node.
            //or call prepend method.
            head = newNode;
            return;
        }

        //we would want to know the memory address of (index-1).
        //targetNode points to the index location we would want to insert.
        Node targetNode = this.head;

        for(int i=1; i<index; i++){
            targetNode = targetNode.next;
        }

        newNode.next = targetNode.next;
        targetNode.next = newNode;

    }

    public void remove(int index){


        //if the logic is too complex it would be probably wrong.

        Node targetNode = this.head;
        Node removeNode = null;
        if(index == 0){
            //edge case : index = 0 : head to be deleted.
            this.head = head.next;
            return;
        }

        //The logic to find the node just before the to be deleted Node.
        for (int i = 1; i < index; i++) {
            targetNode = targetNode.next;
        }
        removeNode = targetNode.next;
        targetNode.next = removeNode.next;


    }


    public void printLinkedList(){

        Node currentNode = this.head;

        System.out.print("Whole linked list : ");
        while(Objects.nonNull(currentNode)){
            System.out.print(currentNode.data+ ", ");
            currentNode = currentNode.next;
        }
    }

    public void reverse(){

        //edge case: when linkedlist has only one element.
        //difficulty: setting head as null and continuing the iteration.

        Node currentNode = this.head;
        Node headNode = this.head;
        Node forwardNode = null;
        Node previousNode = null;


        //loop till the last of the list.
  // DRAW THREE NODES AND CHECK THE FLOW TO UNDERSTAND
        while(currentNode != this.tail){
            forwardNode = currentNode.next;//A11

            if(currentNode == this.head){
                currentNode.next = null; //A10.next = null
            }else{
                currentNode.next = previousNode;
            }
            previousNode = currentNode;
            currentNode = forwardNode;
        }
        this.tail.next = previousNode;
        head = tail;
        tail = headNode;


    }


    static class Node{
        private int data;
        private Node next;
        private Node previous;

        Node(int data){
            this.data = data;
            this.next = null;

        }

    }
}
