package oop.shoppingcart.model;

public class Camera extends Product {
	
    private String type;

    public Camera(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Camera: " + getName());
        System.out.println("Type: " + type);
        System.out.println("Price: $" + getPrice());
    }
}
