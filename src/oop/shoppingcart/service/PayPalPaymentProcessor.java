package oop.shoppingcart.service;

//Additional concrete implementation of PaymentProcessor
public class PayPalPaymentProcessor implements PaymentProcessor {
	
 private String email;

 public PayPalPaymentProcessor(String email) {
     this.email = email;
 }

 @Override
 public void processPayment(double amount) {
     System.out.println("Processing PayPal payment of $" + amount + " to email " + this.email);
 }
}
