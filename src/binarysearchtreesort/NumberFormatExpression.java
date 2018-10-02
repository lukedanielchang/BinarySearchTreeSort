/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtreesort;

import javax.swing.JOptionPane;
/**
 *
 * @author ldcha
 */
public class NumberFormatExpression {
    //throw error message for invalid inputs
     
    public static void numberError() {
        
        JOptionPane.showMessageDialog(null, "Invalid Input Detected.  Please"
                + " double check input and try again", "Whoa There", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void inputError(){
        JOptionPane.showMessageDialog(null, "No input detected", "Whoa There", JOptionPane.WARNING_MESSAGE);
    }
}
