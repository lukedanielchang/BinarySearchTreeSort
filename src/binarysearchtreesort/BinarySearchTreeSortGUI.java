/*
 * This contains the GUI constructor and main class.  
 */
package binarysearchtreesort;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ldcha
 */
public class BinarySearchTreeSortGUI extends JFrame{
    //create main JFrame to house GUI
    private static JFrame mainFrame;
    
    //declare panels for each part of the mainFrame;
    private static JPanel originalPanel;
    private static JPanel sortButtonPanel;
    private static JPanel resultPanel;
  //  private static JPanel optionPanel;
    private static JPanel sortOrderPanel;
    private static JPanel numTypePanel;
    
    //declare Labels for fields
    private static JLabel originalLabel;
    private static JLabel resultLabel;
    private static JLabel sortOrderLabel;
    private static JLabel numTypeLabel;
    
    //declare text fields for input and result
    private static JTextField originalText;
    private static JTextField resultText;

    //declare button that perfoms sort of input
    private static JButton sortButton;
    
    //declare button groups
    private static ButtonGroup sortButtonGroup;
    private static ButtonGroup numButtonGroup;
    
    //declare radio buttons for ascending/descending, and input type
    private static JRadioButton ascendRadio;
    private static JRadioButton descendRadio;
    private static JRadioButton intRadio;
    private static JRadioButton fractionRadio;
    
    //private static BinarySearchTree binaryTree;
      
    //create GUI constructor
    public BinarySearchTreeSortGUI(){
        //set main frame
        mainFrame = new JFrame("Binary Search Tree Sort");
        mainFrame.setSize(1000, 500);
        mainFrame.setLocation(500,100);
        mainFrame.setLayout(new GridLayout(5,1));
        mainFrame.setVisible(true);
        
        //set fonts
        Font f = new Font("Roboto", Font.PLAIN, 30);
        
        //create and initalize Panels
        originalPanel = new JPanel();
        sortButtonPanel = new JPanel();
        resultPanel = new JPanel();
        sortOrderPanel = new JPanel();
        numTypePanel= new JPanel();
        
        //create input labels and text input fields
        originalLabel = new JLabel("Original Input");
        originalText = new JTextField(25);
        originalLabel.setFont(f);
        originalText.setFont(f);
        originalLabel.repaint();
        originalText.repaint();
        originalPanel.add(originalLabel);
        originalPanel.add(originalText);
        
        //create/initalize sort button.  add action listener
        sortButton = new JButton("Perform Sort");
        sortButton.setFont(f);
        sortButton.repaint();
            //add action Listener Here
        sortButtonPanel.add(sortButton);
        
        //create result label and text field
        resultLabel = new JLabel("Sorted List");
        resultText = new JTextField(25);
        resultText.setEditable(false);
        resultLabel.setFont(f);
        resultText.setFont(f);
        resultLabel.repaint();
        resultText.repaint();
        resultPanel.add(resultLabel);
        resultPanel.add(resultText);
        
        //create/initalize button groups and add to button panel
        sortButtonGroup = new ButtonGroup();
        numButtonGroup = new ButtonGroup();
        
        //initalize radio button labels and buttons and add to panels
        sortOrderLabel = new JLabel("Sort Order");
        sortOrderLabel.setFont(f);
        sortOrderLabel.repaint();
        sortOrderPanel.add(sortOrderLabel);
        
        ascendRadio = new JRadioButton("Ascending");
        ascendRadio.setSelected(true);
        ascendRadio.setFont(f);
        ascendRadio.repaint();
        sortButtonGroup.add(ascendRadio);
        sortOrderPanel.add(ascendRadio);
        
        descendRadio = new JRadioButton("Descending");
        descendRadio.setSelected(false);
        descendRadio.setFont(f);
        descendRadio.repaint();
        sortButtonGroup.add(descendRadio);
        sortOrderPanel.add(descendRadio);
        
        //create input type buttons, add to type button group, and to panel
        numTypeLabel = new JLabel("Numeric Type");
        numTypeLabel.setFont(f);
        numTypeLabel.repaint();
        numTypePanel.add(numTypeLabel);
        
        intRadio = new JRadioButton("Integer");
        intRadio.setSelected(true);
        intRadio.setFont(f);
        intRadio.repaint();
        numButtonGroup.add(intRadio);
        numTypePanel.add(intRadio);
        
        fractionRadio = new JRadioButton("Fraction");
        fractionRadio.setSelected(false);
        fractionRadio.setFont(f);
        fractionRadio.repaint();
        numButtonGroup.add(fractionRadio);
        numTypePanel.add(fractionRadio);
       
        //add Panels to mainFrame
        mainFrame.add(originalPanel);
        mainFrame.add(resultPanel);
        mainFrame.add(sortButtonPanel);
        mainFrame.add(sortOrderPanel);
        mainFrame.add(numTypePanel);
        
        //set clean close
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    public static void main(String[] args) {
        BinarySearchTreeSortGUI BSTG = new BinarySearchTreeSortGUI();
    }
    
}