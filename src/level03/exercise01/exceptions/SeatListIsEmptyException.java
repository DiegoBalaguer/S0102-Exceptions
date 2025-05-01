package level03.exercise01.exceptions;

/**
 * PROGRAM: SeatListIsEmptyException
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class SeatListIsEmptyException extends Exception {
    public SeatListIsEmptyException() {
        super("We don't have any reserved seats.");
    }
}