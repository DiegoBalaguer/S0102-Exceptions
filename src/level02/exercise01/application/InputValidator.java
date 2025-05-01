package level02.exercise01.application;

import level02.exercise01.exceptions.*;

/**
 * PROGRAM: InputValidator
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class InputValidator {

    public void fingersFilter(byte numFingers) throws FingersException {

        if (!(numFingers >= 0 && numFingers <= 10)) {
            throw new FingersException("Enter the fingers between 0 and 10.");
        }
    }

    public void floorsFilter(int numFloors) throws FloorsException {

        if (!(numFloors > 0 && numFloors <= 65)) {
            throw new FloorsException("Enter the floors between 1 and 65.");
        }
    }

    public void computersPrice(float computerPrice) throws ComputersPriceException {

        if (!(computerPrice > 0 && computerPrice <= 6000)) {
            throw new ComputersPriceException("Enter the price computer between 1 and 6000€.");
        }
    }

    public void sheetsStock(double sheetsStock) throws SheetsException {

        if (!(sheetsStock > 0 && sheetsStock <= 100000)) {
            throw new SheetsException("Enter the stock sheets between 1 and 100000.");
        }
    }

    public void vocalsChar(char vocal) throws VocalsException {

        if (!isVocal(vocal)) {
            throw new VocalsException();
        }
    }

    public void passwdLenght(String password) throws PasswdException {

        if (password.length() < 10) {
            throw new PasswdException();
        }
    }

    public boolean isVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
