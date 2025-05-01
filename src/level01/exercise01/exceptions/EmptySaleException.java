package level01.exercise01.exceptions;

/**
 * PROGRAM: EmptySaleException
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class EmptySaleException extends Exception {

    public EmptySaleException() {

        super("To make a sale you first have to add products.");

    }
}



