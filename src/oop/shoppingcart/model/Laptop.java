package oop.shoppingcart.model;

//Concrete product classes
public class Laptop extends Product {
	
 private String brand;

 public Laptop(String name, double price, String brand) {
     super(name, price);
     this.brand = brand;
 }

 @Override
 public void displayProductInfo() {
     System.out.println("Laptop: " + getName());
     System.out.println("Brand: " + brand);
     System.out.println("Price: $" + getPrice());
 }
}

