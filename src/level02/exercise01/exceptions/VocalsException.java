package level02.exercise01.exceptions;

/**
 * PROGRAM: VocalsException
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class VocalsException extends Exception {
    public VocalsException() {
        super("Character not is vocal");
    }
}
