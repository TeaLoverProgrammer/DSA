package BST;

public class BSTInitiator {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(20);
        bst.insert(4);
        bst.insert(1);
        bst.insert(6);
        bst.insert(15);
        bst.insert(170);
        if(bst.lookUp(1700)){
            System.out.println("Number found in BST");
        }else{
            System.out.println("Not found!!");
        }
    }
}
