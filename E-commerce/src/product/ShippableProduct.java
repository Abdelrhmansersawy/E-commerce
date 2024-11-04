package product;

import product.interfaces.Shippable;

import java.time.LocalDate;

public class ShippableProduct extends Product implements Shippable {
    private double weight;
    public ShippableProduct(String name, int quantity, double price, double weight) {
        super(name,quantity,price);
        this.weight = weight;
    }


    @Override
    public double getWeight() {
        return this.weight;
    }
}
