package level01.exercice01.data;

import level01.exercice01.model.Product;
import level01.exercice01.model.Sale;

public class DataProducts {
    public void loadProducts(Sale sale) {

        System.out.println("** Load articles in Sale..........." + System.lineSeparator());
        Product product;
        sale.addProduct(new Product("Book of Java", 48.90));
        sale.addProduct(new Product("Windows 8 Pro", 28.65));
        sale.addProduct(new Product("The bible of Microsoft Excel", 76.84));
    }
}
