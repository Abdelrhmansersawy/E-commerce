package product.interfaces;

public interface Product {
    String getName();
    int getQuantity();
    double getPrice();
    boolean inStock(int requiredQuantity);
}
