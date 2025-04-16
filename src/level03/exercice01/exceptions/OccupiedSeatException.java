package level03.exercice01.exceptions;

/**
 * PROGRAM: OccupiedSeatException
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class OccupiedSeatException extends Exception {
    public OccupiedSeatException() {
        super("Occupied seat exception.");
    }
}
