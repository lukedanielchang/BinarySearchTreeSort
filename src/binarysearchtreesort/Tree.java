/*
 * defines and constructs tree with traversal methods
 */
package binarysearchtreesort;

/**
 *
 * @author ldcha
 */
public class Tree<BST> {
    //create key
    public BST key;
    
    //nodes
    public Tree<BST> leftChild;
    public Tree<BST> rightChild;
    
    //initalie tree
    
    public Tree(BST Key){
        this.key = key;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    //create method to retrieve right node/child
    public Tree<BST> getRightNode(){
        return rightChild;
    }
    
    //create method to retriev left node/child
    public Tree<BST> getLeftNode(){
        return leftChild;
    }
    
    //create method to convert input to String
        @Override
        public String toString(){
            return key + " ";
        }
}
