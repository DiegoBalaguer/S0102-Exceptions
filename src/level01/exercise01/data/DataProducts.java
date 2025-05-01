package level01.exercise01.data;

import level01.exercise01.model.Product;
import level01.exercise01.model.Sale;

/**
 * PROGRAM: DataProducts
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class DataProducts {
    public void loadProducts(Sale sale) {

        System.out.println("** Load articles in Sale..........." + System.lineSeparator());
        Product product;
        sale.addProduct(new Product("Book of Java", 48.90));
        sale.addProduct(new Product("Windows 8 Pro", 28.65));
        sale.addProduct(new Product("The bible of Microsoft Excel", 76.84));
    }
}
