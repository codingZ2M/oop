import java.util.ArrayList;
import java.util.List;

import oop.shoppingcart.model.Product;
import oop.shoppingcart.service.PaymentProcessor;

// Shopping Cart that contains a list of products
class ShoppingCart {
	
    private List<Product> items = new ArrayList<>();
    private PaymentProcessor paymentProcessor;

    public void addItem(Product item) {
        items.add(item);
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout() {
        double total = calculateTotal();
        paymentProcessor.processPayment(total);
        System.out.println("Thank you for shopping!");
    }

    private double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
