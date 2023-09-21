package oop.shoppingcart.model;

//Abstract class representing a product
public abstract class Product {
	
 private String name;
 private double price;

 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 // Abstract method for displaying product details
 public abstract void displayProductInfo();
}
