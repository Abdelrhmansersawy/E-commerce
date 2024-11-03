package product;

import product.interfaces.Product;
import product.interfaces.Shippable;

import java.time.LocalDate;

public class NonExpiredShippableProduct implements Product, Shippable {
    private String name;
    private int quantity;
    private double price;
    private double weight;

    public NonExpiredShippableProduct(String name, int quantity, double price, double weight){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean inStock(int requiredQuantity) {
        return getQuantity() >= requiredQuantity;
    }

}
