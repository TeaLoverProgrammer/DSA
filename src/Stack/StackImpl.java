package Stack;

import java.util.Objects;

//The top node points to the bottom.
public class StackImpl {
    private Node top;
    private Node bottom;
    private int length;

    StackImpl(){
        this.top = null;
        this.bottom = null;
        length = 0;
    }

    public String peek(){

        if (Objects.isNull(top)) {
            System.out.println("There are no items in the stack to peek!");
        }
        return this.top.data;

    }

    public void push(String data){
        Node node = new Node(data);

        if(Objects.isNull(top)){
            top = node;
            bottom = top;
            length++;

        }else{
            node.next = top;
            top = node;
        }



    }


    //how to go back to the previous elemet?
    public String pop(){
        if (Objects.isNull(top)) {
            System.out.println("There are no items in the stack to pop!");
        }
        //if there is only one node in the stack.
        if(this.top == this.bottom){
            this.bottom = null;
        }
         String topValue = this.top.data;
        this.top = top.next;
        return topValue;


    }

    public boolean isEmpty(){
        return this.top == null;

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

