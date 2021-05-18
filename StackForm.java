/*
* This program uses the MrCoxallStack class.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-05-17
*/
// package ca.mths.unit2.unit01.java.stackForm;

import java.util.Scanner;

public final class StackForm {
    private StackForm() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method gets some string input and shows reversed string.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        MrCoxallStack aStack = new MrCoxallStack();

        while (true) {
            System.out.print("Enter the number to push on the stack: ");
            try {
                int inputNumber = Integer.parseInt(myObj.nextLine());
                aStack.push(inputNumber);
            } catch (Exception ex) {
                break;
            }
        }
        System.out.println("\nThe Stack: ");
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
