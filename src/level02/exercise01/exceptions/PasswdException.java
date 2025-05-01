package level02.exercise01.exceptions;

/**
 * PROGRAM: PasswdException
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class PasswdException extends Exception {
    public PasswdException() {
        super("The password must be equal or greater than 10 characters.");
    }
}

