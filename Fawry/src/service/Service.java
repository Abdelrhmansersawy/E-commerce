package service;

import Customer.Customer;
import cart.Cart;
import cart.CartItem;
import product.interfaces.Product;
import product.interfaces.Shippable;

import java.util.List;

public class Service {

    // Print the checkout (include shipment notice and checkout receipt)
    public static void printCheckout(Customer customer , Cart cart){
        if(cart.isEmpty()){
            throw new IllegalArgumentException("The cart can't be empty");
        }

        if(customer.getBalance() < cart.getTotalAmount()){
            throw new IllegalArgumentException("The balance 's insufficient");
        }

        System.out.println("** Shipment notice **");
        for(CartItem item : cart.getItems()){
            if((item.getProduct() instanceof Shippable)){
                System.out.printf("2x %d %s %.2fkg%n",
                        item.getQuantity(),
                        item.getProduct().getName(),
                        item.getWeight())
                ;
            }
        }
        System.out.printf("TOTAL package weight %.1fkg%n%n", cart.getTotalWeight());

        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.printf("%dx %s\t%.0f%n",
                    item.getQuantity(),
                    item.getProduct().getName(),
                    item.getSubtotal());
        }

        System.out.println("----------------------------------------");
        System.out.printf("Subtotal\t%.0f%n", cart.getSubtotal());
        System.out.printf("Shipping\t%.0f%n", cart.getShippedPrice());
        System.out.printf("Amount\t\t%.0f%n", cart.getTotalAmount());
        System.out.printf("Remaining Balance\t\t%.0f%n", customer.getBalance() - cart.getTotalAmount());
    }

    public static void ShippingService(List<Product> items){
        //
    }
}
