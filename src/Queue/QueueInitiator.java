package Queue;

public class QueueInitiator {
    public static void main(String[] args){
  /*      QueueImpl myQueue = new QueueImpl();
        System.out.println(myQueue.isEmpty());
        myQueue.enqueue("Git");
        myQueue.enqueue("Udemy");
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.isEmpty());*/

        QueueUsingStacks myQueue = new QueueUsingStacks();
        System.out.println(myQueue.isEmpty());
        myQueue.enqueue("Git");
        myQueue.enqueue("Udemy");
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.isEmpty());
    }
}
