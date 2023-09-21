
import oop.shoppingcart.model.Camera;
import oop.shoppingcart.model.Laptop;
import oop.shoppingcart.model.Product;
import oop.shoppingcart.service.CreditCardPaymentProcessor;
import oop.shoppingcart.service.PayPalPaymentProcessor;
import oop.shoppingcart.service.PaymentProcessor;

	public class CartCheckout {
	    public static void main(String[] args) {
	    	
	        // Create products
	        Product laptop = new Laptop("Dell XPS 13", 800.0, "Dell");
	        Product camera = new Camera("EOS 1500D 24.1 Digital SLR Camera ", 355.99, "Digital Single-Lens Reflex (DSLR)");

	        // Create a shopping cart
	        ShoppingCart cart = new ShoppingCart();
	        cart.addItem(laptop);
	        cart.addItem(camera);

	        // Set payment processors
	        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor("1234-5678-9012-3456");
	        PaymentProcessor paypalProcessor = new PayPalPaymentProcessor("user@example.com");

	        
	        // Perform checkout with different payment options
	        cart.setPaymentProcessor(creditCardProcessor);
	        cart.checkout();
	   
	        cart.setPaymentProcessor(paypalProcessor);
	        cart.checkout();

	    }
	}