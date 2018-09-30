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
 */
public class Fraction implements Comparable {
    //initalize var to hold fractions

    private final String fraction;

    //create constructor
    public Fraction(String fraction) {
        this.fraction = fraction;
    }

    //method to compare and sort fractions
    @Override
    public int compareTo(Object input) {
        //push variables into array
        String number[] = fraction.split("/");

        //create numerator and denom variables
        int numerator = Integer.valueOf(number[0]);
        int denominator = Integer.valueOf(number[1]);

        //split fractions in array
        number = input.toString().split("/");

        //left side sum of num and denom
        int leftSideTotal = numerator * Integer.valueOf(number[1]);
        //right side sum of num and denom
        int rightSideTotal = denominator * Integer.valueOf(number[0]);

        //returns 1 if the total on left side is greater than right
        if ((leftSideTotal) > (rightSideTotal)) {
            return 1;
        } //returns -1 is the total on the left side is less than the right side
        else if ((leftSideTotal) < (rightSideTotal)) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return fraction;
    }

}
