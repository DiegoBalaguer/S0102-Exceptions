package level01.exercise01.application;

import level01.exercise01.model.Sale;
import level01.exercise01.exceptions.EmptySaleException;

/**
 * PROGRAM: ExceptionHandler
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class ExceptionHandler {

    private final Sale sale;

    public ExceptionHandler(Sale sale) {
        this.sale = sale;
    }

    public void checkEmptySale() {
        System.out.println(System.lineSeparator() + "** Checking for empty sale...");

        try {
            sale.calculateTotalSale();
            System.out.println("Total price: " + sale.getTotalPrice());
        } catch (EmptySaleException e) {
            System.err.println("EmptySaleException: " + e.getMessage());
        }
    }

    public void checkInvalidProductIndex(int index) {
        System.out.println(System.lineSeparator() + "** Checking for invalid product index...");

        try {
            System.out.println("Product at index " + index + ": " + sale.getProducts().get(index));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
