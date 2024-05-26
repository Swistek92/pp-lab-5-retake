package store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Product> products;
    private final List<Employee> employees;
    private static String storeName;

    // Constructor
    public Store(String storeName) {
        this.products = new ArrayList<>();
        this.employees = new ArrayList<>();
        Store.storeName = storeName;
    }

    // Add product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove product
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Remove employee
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Display products
    public void displayProducts() {
        for (Product product : products) {
            product.displayInfo();
            System.out.println();
        }
    }

    // Display employees
    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getDetails());
            System.out.println();
        }
    }

    // Get products
    public List<Product> getProducts() {
        return products;
    }

    // Get store name
    public static String getStoreName() {
        return storeName;
    }
}