package BST;

import java.util.ArrayList;
import java.util.Objects;

public class BinarySearchTree {

    private Node root;

    BinarySearchTree(){
        this.root = null;
    }

    //insert
    public void insert(int data){
        Node newNode = new Node(data);
        if(Objects.isNull(root)){
            this.root = newNode;
        }else{
            traverseAndInsert(newNode);
        }
    }

    private void traverseAndInsert(Node node){
        Node pointerNode = this.root;
        boolean positionFound = false;

        while(!positionFound){
    //input is greater than the root node
            if(node.data > pointerNode.data){
                //iterate till we find a null position.
                if(Objects.isNull(pointerNode.right)){
                    pointerNode.right = node;
                    positionFound = true;
                }else{
                    pointerNode = pointerNode.right;
                }
            }//if the input is lesser than the root node
            else{

                if(Objects.isNull(pointerNode.left)){
                    pointerNode.left = node;
                    positionFound = true;
                }else{
                    pointerNode = pointerNode.left;
                }
            }
        }

    }

    //lookup
    public boolean lookUp(int data){
        //if the root node itself is not there, return false.
        if(Objects.isNull(this.root)){
            return false;
        }
        boolean found = false;
        Node pointerNode = this.root;

       /* while(!found){
           if(Objects.nonNull(pointerNode)){
               if(data > pointerNode.data){
                   pointerNode = pointerNode.right;
               }else if(data < pointerNode.data){
                   pointerNode = pointerNode.left;
               }else{
                   found = true;
               }
           }else{
               //if the data could not be found in the BST
               break;
           }
        }*/

     //loop through the node till it becomes null.
            while(Objects.nonNull(pointerNode)){
                if(data > pointerNode.data){
                    pointerNode = pointerNode.right;
                }else if(data < pointerNode.data){
                    pointerNode = pointerNode.left;
                }else{
                    return true;
                }
            }
        return found;
    }

    static class Node{
        private int data;
        private Node left;
        private Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
