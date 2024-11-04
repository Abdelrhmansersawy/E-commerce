package product;

import product.interfaces.ExpirableShippable;
import product.interfaces.Product;

import java.time.LocalDate;

public class ExpiredShippableProduct implements Product, ExpirableShippable {
    private String name;
    private int quantity;
    private double price;
    private double weight;
    private LocalDate expiredDate;
    public ExpiredShippableProduct(String name, int quantity, double price, double weight , LocalDate expiredDate) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
        this.expiredDate = expiredDate;
    }
    public boolean isExpired(){
        return LocalDate.now().isAfter(expiredDate);
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
    public void discount(int amount) {
        if(amount > quantity){
            throw new IllegalArgumentException("There 's no enough quantity into stock");
        }
        this.quantity -= amount;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
    @Override
    public boolean inStock(int requiredQuantity) {
        return getQuantity() < requiredQuantity;
    }

}
