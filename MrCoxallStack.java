/*
* This class creates an integer stack.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-05-17
*/
// package ca.mths.unit2.unit01.java.mrCoxallStack;

import java.util.Stack;

public final class MrCoxallStack {
    private MrCoxallStack() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /** create the stack as an ArrayList (array that grows as I need it!). */
    private static Stack<Integer> stackAsArray = new Stack<Integer>();

    /**
    * This method push an integer to the stack.
    * @param pushNumber
    */
    public static void push(final int pushNumber) {
        stackAsArray.push(pushNumber);
    }

    /**
    * This method prints out the list of items in the stack.
    */
    public static void showStack() {
        for (int index = 0; index < stackAsArray.size(); index++) {
            System.out.println(stackAsArray.get(index));
        }
    }
}
