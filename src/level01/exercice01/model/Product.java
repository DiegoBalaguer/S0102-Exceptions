package level01.exercice01.model;

/**
 * PROGRAM: Product
 * AUTHOR: Diego Balaguer
 * DATE: 05/04/2025
 */

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    private void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("An empty object name cannot be assigned.");
        } else
            this.name = name;
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("The base price must be greater than 1€.");
        } else
            this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
