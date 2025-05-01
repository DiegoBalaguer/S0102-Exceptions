package level01.exercise01.model;

import level01.exercise01.exceptions.EmptySaleException;

import java.util.ArrayList;

/**
 * PROGRAM: Sale
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class Sale {

    private ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void calculateTotalSale() throws EmptySaleException {

        double totalSale = 0;

        if (products.isEmpty()) {
            throw new EmptySaleException();
        } else {
            for (Product product : products) {
                totalSale += product.getPrice();

            }
            this.totalPrice = totalSale;
        }
    }
}

