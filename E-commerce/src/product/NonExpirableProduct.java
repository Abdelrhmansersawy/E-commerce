package product;

import product.interfaces.Product;

public class NonExpirableProduct implements Product {
    private String name;
    private int quantity;
    private double price;

    public NonExpirableProduct(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
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
        return getQuantity() < requiredQuantity;
    }

    @Override
    public void discount(int amount) {
        if(amount > quantity){
            throw new IllegalArgumentException("There 's no enough quantity into stock");
        }
        this.quantity -= amount;
    }
}
