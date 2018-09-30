/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtreesort;

/**
 *
 * @author ldcha
 */
public class BinarySearchTree<BST> {
    //initalize output string and tree

    private String output = "";
    private Tree<BST> root;

    public Tree<BST> inializeTree(BST inputArray[]) {
        //initalize root to null each time method is called
        root = null;
        Tree<BST> insertNode;

        //iterate over array to insert nodes into tree
        for (int i = 0; i < inputArray.length; i++) {
            insertNode = new Tree<>(inputArray[i]);
            root = insertNodeToTree(root, insertNode);
        }
        return root;
    }

    //create method to insert nodes into the tree
    public Tree<BST> insertNodeToTree(Tree<BST> rootNode, Tree<BST> nextNode) {
        //check for null root
        if (rootNode == null) {
            return nextNode;
        }
        //check if node is integer
        if (isValidInteger(rootNode.key)) {
            //convert nodes to int and store in node variable
            int parentNode = (Integer) rootNode.key;
            int newNode = (Integer) nextNode.key;

            //compare nodes values to assign in correct spot
            if (newNode < parentNode) {
                rootNode.leftChild = insertNodeToTree(rootNode.leftChild, nextNode);
            } else if (newNode == parentNode) {
                rootNode.rightChild = insertNodeToTree(rootNode.rightChild, nextNode);
            } else if (newNode > parentNode) {
                rootNode.rightChild = insertNodeToTree(rootNode.rightChild, nextNode);
            }
            return rootNode;
        } //execute if for fractions
        else {
            //create fraction variable to store node values
            Fraction newFractionNode = (Fraction) nextNode.key;

            //variable to hold value to compare nodes
            int compareNodes = (newFractionNode).compareTo(rootNode.key);

            //compare node values to assign to correct spot
            if (compareNodes < 0) {
                rootNode.leftChild = insertNodeToTree(rootNode.leftChild, nextNode);
            } else if (compareNodes == 0) {
                rootNode.rightChild = insertNodeToTree(rootNode.rightChild, nextNode);
            } else if (compareNodes > 0) {
                rootNode.rightChild = insertNodeToTree(rootNode.rightChild, nextNode);
            }
            return rootNode;
        }
    }

    //check valid integer input with boolean
    public boolean isValidInteger(Object node) {
        return node instanceof Integer;
    }

    //ascending tree order traversal
    public String ascTreeTraversal(Tree<BST> node) {
        //check for remaining nodes
        if (node != null) {
            //traverse tree left to right
            ascTreeTraversal(node.leftChild);

            //store node to output string
            output += String.valueOf(node.key + " ");

            //traverses over right nodes
            ascTreeTraversal(node.rightChild);
        }
        return output;
    }
    //descending tree order traversal

    public String descTreeTraversal(Tree<BST> node) {
        //check for remainging nodes
        if (node != null) {
            //traverse tree right to left
            descTreeTraversal(node.rightChild);

            //store node to output string
            output += String.valueOf(node.key + " ");

            //traverse over left nodes
            descTreeTraversal(node.leftChild);
        }
        return output;
    }
}
