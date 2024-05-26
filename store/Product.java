package store;

public class Product {
    private String name;
    private double price;
    private int id;

    // Constructor
    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Display information about the product
    public void displayInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}