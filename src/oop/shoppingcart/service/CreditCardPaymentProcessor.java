package oop.shoppingcart.service;

//Concrete implementation of PaymentProcessor
public class CreditCardPaymentProcessor implements PaymentProcessor {
	
 private String cardNumber;

 public CreditCardPaymentProcessor(String cardNumber) {
     this.cardNumber = cardNumber;
 }

 @Override
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of $" + amount + " with card number " + this.cardNumber);
 }
 
}
