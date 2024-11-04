package product;

import product.interfaces.Expirable;

import java.time.LocalDate;

public class ExpirableProduct extends Product implements Expirable {
    private LocalDate expiredDate;

    public ExpirableProduct(String name, int quantity , double price , LocalDate expiredDate){
        super(name, quantity, price);
        this.expiredDate = expiredDate;
    }

    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiredDate); // Test if the product 's expired or not
    }
}
