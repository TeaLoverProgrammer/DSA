package Queue;

import java.util.Objects;

public class QueueImpl {


    private Node first;
    private Node last;
    private int length;

    QueueImpl(){
        this.first = null;
        length = 0;
    }

    //enqueue
    public void enqueue(String data){
        Node newNode = new Node(data);
        if (Objects.isNull(first)) {
            first = newNode;
            last = first; //at first, the first and the last node points to the same address.
            length++;
        }else{
            last.next = newNode;
            last = newNode;
            length++;
        }
    }
    //dequeue
    public String dequeue(){
        //if there is only one item in the queue
        if(this.first == this.last){
            this.last = null;
        }
        String firstData = first.data;
        first = first.next;
        length--;
        return firstData;
    }
    //peek
    public String peek(){
        return this.first.data;
    }
    //isEmpty
    public boolean isEmpty(){
        return this.length == 0;
    }
    static class Node{
        private String data;
        private Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
}
