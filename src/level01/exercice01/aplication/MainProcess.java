package level01.exercice01.aplication;

import level01.exercice01.data.DataProducts;
import level01.exercice01.model.Sale;

public class MainProcess {

    public void run() {

        System.out.println("* STARTING SALE PROCESS..........." + System.lineSeparator());
        Sale sale = new Sale();

        ExceptionHandler exceptionHandler = new ExceptionHandler(sale);
        DataProducts products = new DataProducts();

        System.out.println("** Check Exceptions with error..........." + System.lineSeparator());

        exceptionHandler.checkEmptySale();
        exceptionHandler.checkInvalidProductIndex(2);

        products.loadProducts(sale);

        System.out.println("** Check Exceptions no error..........." + System.lineSeparator());

        exceptionHandler.checkEmptySale();
        exceptionHandler.checkInvalidProductIndex(2);
        System.out.println();
    }
}
