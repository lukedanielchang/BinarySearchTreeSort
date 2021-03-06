/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtreesort;

/**
 *
 * @author Luke Chang
 * CMSC 350
 * @param <BST>
 */
public class BinarySearchTree<BST>{
    //initalize output string and tree

    private String output = "";
    private Tree<BST> root;
    
    public Tree<BST> initalizeTree(BST inputArray[]) {
        //initalize root to null
        //root = null;
        Tree<BST> insertNode = null;
        Tree<BST> root = null;

        //iterate over array to insert nodes into tree
        for (int i = 0; i < inputArray.length; i++) {
            insertNode = (Tree<BST>) inputArray[i];
           root = insertNodeToTree(root, insertNode);
            System.out.println(insertNode);
        }
          root = insertNode;
          
        return root;
    }

    //create method to insert nodes into the tree
    public Tree<BST> insertNodeToTree(Tree<BST> rootNode, Tree<BST> nextNode) {
        //check for null root
        if (rootNode == null) {
            root = rootNode;
            return root;
        }
        //check if node is integer
      else if(isValidInteger(rootNode.key)) {
            //convert nodes to int and store in node variable
            int parentNode = (Integer) rootNode.key;
            int newNode = (Integer) nextNode.key;

            //compare nodes values to assign in correct spot
            if (newNode < parentNode) {
                rootNode.leftChild = insertNodeToTree(rootNode.leftChild,
                        nextNode);
            } else if (newNode == parentNode) {
                rootNode.rightChild = insertNodeToTree(rootNode.rightChild,
                        nextNode);
            } else if (newNode > parentNode) {
                rootNode.rightChild = insertNodeToTree(rootNode.rightChild,
                        nextNode);
            }
            return rootNode;

        } //execute if for fractions
       /* else {
            //create fraction variable to store node values
            Fraction newFractionNode = (Fraction) nextNode.key;

            //variable to hold value to compare nodes
            int compareNodes = (newFractionNode).compareTo(rootNode.key);

            //compare node values to assign to correct spot
            if (compareNodes < 0) {
                rootNode.leftChild = insertNodeToTree(rootNode.leftChild,
                        nextNode);
            } else if (compareNodes == 0) {
                rootNode.rightChild = insertNodeToTree(rootNode.rightChild,
                        nextNode);
            } else if (compareNodes > 0) {
                rootNode.rightChild = insertNodeToTree(rootNode.rightChild,
                        nextNode);

                //rec call func?
            }
            return rootNode;
        } 
        */ return rootNode;
    } 
    
    //check valid integer input with boolean
    public boolean isValidInteger(Object node) {
        return node instanceof Integer;
    }

    //ascending tree order traversal
    public String inOrderTraversal(Tree<BST> node) {
        //check for remaining nodes
        if (node != null) {
            //traverse tree left to right
            inOrderTraversal(node.leftChild);
            //store node to output string
            output += String.valueOf(node.key + " ");

            //traverses over right nodes
            inOrderTraversal(node.rightChild);
        }
        return output;
    }
    //descending tree order traversal
    public String postOrderTraversal(Tree<BST> node) {
        //check for remainging nodes
        if (node != null) {
            //traverse tree right to left
            postOrderTraversal(node.rightChild);

            //store node to output string
            output += String.valueOf(node.key + " ");

            //traverse over left nodes
            postOrderTraversal(node.leftChild);
        }
        return output;
    }
}
