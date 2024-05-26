import store.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("Tech Superstore");

        Product product1 = new Product("Oracle Database", 100000.0, 1);
        Product product2 = new Product("SAP ERP", 200000.0, 2);
        Product product3 = new Product("Microsoft Dynamics", 150000.0, 3);
        Product product4 = new Product("IBM Cognos Analytics", 120000.0, 4);
        Product product5 = new Product("Autodesk Maya", 4500.0, 5);

        product5.setName("Adobe Photoshop");
        product5.setPrice(2500.0);

        Manager manager = new Manager("Larry", "Fink", 101);
        System.out.println(manager.getDetails());
        manager.work();

        Salesperson salesperson1 = new Salesperson("Alice", "Smith", 201);
        Salesperson salesperson2 = new Salesperson("Bob", "Johnson", 202);
        Salesperson salesperson3 = new Salesperson("Charlie", "Brown", 203);
        Salesperson salesperson4 = new Salesperson("Diana", "Ross", 204);
        Salesperson salesperson5 = new Salesperson("Eve", "Davis", 205);

        System.out.println(salesperson1.getDetails());
        salesperson1.work();
        
        System.out.println(salesperson2.getDetails());
        salesperson2.work();
        
        System.out.println(salesperson3.getDetails());
        salesperson3.work();
        
        System.out.println(salesperson4.getDetails());
        salesperson4.work();
        
        System.out.println(salesperson5.getDetails());
        salesperson5.work();

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        store.addProduct(product5);

        store.addEmployee(manager);
        store.addEmployee(salesperson1);
        store.addEmployee(salesperson2);
        store.addEmployee(salesperson3);
        store.addEmployee(salesperson4);
        store.addEmployee(salesperson5);

        System.out.println("Products in " + Store.getStoreName() + ":");
        store.displayProducts();

        System.out.println("Employees in " + Store.getStoreName() + ":");
        store.displayEmployees();

        store.removeProduct(product5);
        store.removeEmployee(salesperson5);

        System.out.println("Products in " + Store.getStoreName() + ":");
        store.displayProducts();

        System.out.println("Employees in " + Store.getStoreName() + ":");
        store.displayEmployees();

        // Calculate total sales
        List<Product> products = store.getProducts();
        double totalSales = StoreUtil.calculateTotalSales(products);
        System.out.println("Total sales: " + totalSales + " chf");
    }
}