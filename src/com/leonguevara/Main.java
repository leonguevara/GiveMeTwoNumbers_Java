/*
    GiveMeTwoNumbers_Java
    Main.java

    This program will ask the user for two whole numbers and two real numbers.  It will show
    the addition, subtraction, multiplication, division and remainder of division of the two
    whole numbers, as well as the division of both numbers treated as real numbers.

    It will also show the addition, subtraction, multiplication and division of the two real
    numbers.

    Java:   SDK 1.8 - Language level 8

    Author: León Felipe Guevara Chávez
    email:  leon.guevara@itesm.mx
    date:   May 25th, 2017
 */
package com.leonguevara;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);   // This time we put this inside main because we can!

        System.out.println("Give me two whole numbers:");       // We ask for the two whole numbers
        // We can read both values in the same line, but since that would require code structures
        // that we are going to see in the next chapters, we are going to stick to ask for the
        // numbers one at a time
        System.out.print("whole number 1: ");
        int wholeNumber1 = scanner.nextInt();           // We can declare variables in the midst of our code!
        System.out.print("whole number 2: ");
        int wholeNumber2 = scanner.nextInt();

        System.out.println("\nGive me two real numbers:");      // We ask for the two real numbers
        // We can read both values in the same line, but since that would require code structures
        // that we are going to see in the next chapters, we are going to stick to ask for the
        // numbers one at a time
        System.out.print("real number 1: ");
        double realNumber1 = scanner.nextDouble();
        System.out.print("real number 2: ");
        double realNumber2 = scanner.nextDouble();

        System.out.println("\n=== Whole numbers:");     // We display our results regarding the whole numbers
        System.out.println(wholeNumber1 + " + " + wholeNumber2 + " = " + (wholeNumber1 + wholeNumber2));
        System.out.println(wholeNumber1 + " - " + wholeNumber2 + " = " + (wholeNumber1 - wholeNumber2));
        System.out.println(wholeNumber1 + " * " + wholeNumber2 + " = " + (wholeNumber1 * wholeNumber2));
        System.out.println(wholeNumber1 + " / " + wholeNumber2 + " = " + (wholeNumber1 / wholeNumber2));
        System.out.println(wholeNumber1 + " mod " + wholeNumber2 + " = " + (wholeNumber1 % wholeNumber2));
        System.out.println(wholeNumber1 + " / " + wholeNumber2 + " = " +
                ((double)wholeNumber1 / (double)wholeNumber2) + " (cast as real)");

        System.out.println("\n=== Real numbers:");      // We display our results regarding the real numbers
        System.out.println(realNumber1 + " + " + realNumber2 + " = " + (realNumber1 + realNumber2));
        System.out.println(realNumber1 + " - " + realNumber2 + " = " + (realNumber1 - realNumber2));
        System.out.println(realNumber1 + " * " + realNumber2 + " = " + (realNumber1 * realNumber2));
        System.out.println(realNumber1 + " / " + realNumber2 + " = " + (realNumber1 / realNumber2));
        // We added the following line jus to show that the remainder operation, generally used only on
        // whole numbers, can be used in real numbers in Java language
        System.out.println(realNumber1 + " mod " + realNumber2 + " = " + (realNumber1 % realNumber2));
    }
}
