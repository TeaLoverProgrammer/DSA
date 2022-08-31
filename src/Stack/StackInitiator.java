package Stack;

public class StackInitiator {
    public static void main(String[] args){
        StackImplWithArray myStack = new StackImplWithArray();
        System.out.println(myStack.isEmpty());
        myStack.push("Git");
        myStack.push("Udemy");
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());



    }
}
