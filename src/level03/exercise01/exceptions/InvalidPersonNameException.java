package level03.exercise01.exceptions;

/**
 * PROGRAM: InvalidPersonNameException
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class InvalidPersonNameException extends Exception {
    public InvalidPersonNameException() {
        super("Invalid Person Name Exception. The name cannot contain numbers.");
    }
}
