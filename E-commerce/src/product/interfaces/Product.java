package product.interfaces;

public interface Product {
    String getName();
    int getQuantity();
    double getPrice();
    void discount(int amount);
    boolean inStock(int requiredQuantity);

}
