package level03.exercise01.aplication;

import level03.exercise01.exceptions.InvalidPersonNameException;
import level03.exercise01.exceptions.InvalidRowException;
import level03.exercise01.exceptions.InvalidSeatException;

/**
 * PROGRAM: FiltersCinema
 * AUTHOR: Diego Balaguer
 * DATE: 08/04/2025
 */

public class FiltersCinema {
    public static void namePersonFilter(String namePerson) throws InvalidPersonNameException {

        if (namePerson.matches(".*\\d.*")) {
            throw new InvalidPersonNameException();
        }
    }

    public static void rowFilter(int row, int rowsCinema) throws InvalidRowException {

        if (!(row >= 1 && row <= rowsCinema)) {
            throw new InvalidRowException("Invalid row number.");
        }
    }

    public static void seatFilter(int seat, int seatsCinema) throws InvalidSeatException {
        if (!(seat >= 1 && seat <= seatsCinema)) {
            throw new InvalidSeatException("Invalid seat number.");
        }
    }
}
