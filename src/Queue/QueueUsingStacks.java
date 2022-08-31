package Queue;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack inputStack;
    private Stack outputStack;

    QueueUsingStacks(){
        this.inputStack = new Stack();
        this.outputStack = new Stack();
    }
    //enqueue
    public void enqueue(String data){
        this.inputStack.push(data);
    }
    //dequeue
    public String dequeue(){
        if(this.outputStack.isEmpty()){
            moveToOutputStack();
        }
        return (String)this.outputStack.pop();
    }

    private void moveToOutputStack(){
        while(!inputStack.isEmpty()){
            this.outputStack.push(inputStack.pop());
        }
    }
    //peek
    public String peek(){
        if(this.outputStack.isEmpty()){
            moveToOutputStack();
        }
        return (String)this.outputStack.peek();
    }
    //isEmpty
    public boolean isEmpty(){
        return this.inputStack.isEmpty() && this.outputStack.isEmpty();
    }
}
