package product;

import product.interfaces.Expirable;
import product.interfaces.Product;

import java.time.LocalDate;

public class ExpirableProduct implements Product, Expirable {
    private String name;
    private int quantity;
    private double price;
    private LocalDate expiredDate;

    public ExpirableProduct(String name, int quantity , double price , LocalDate expiredDate){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.expiredDate = expiredDate;
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
        return getQuantity() >= requiredQuantity;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiredDate); // Test of the product 's expired or not
    }
}
