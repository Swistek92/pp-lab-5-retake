import store.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Oracle Database", 100000.0, 1);
        Product product2 = new Product("SAP ERP", 200000.0, 2);
        Product product3 = new Product("Microsoft Dynamics", 150000.0, 3);
        Product product4 = new Product("IBM Cognos Analytics", 120000.0, 4);
        Product product5 = new Product("Autodesk Maya", 4500.0, 5);

        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
        product4.displayInfo();
        product5.displayInfo();

        product5.setName("Adobe Photoshop");
        product5.setPrice(2500.0);

        System.out.println("Updated fifth product information:");
        System.out.println("Name: " + product5.getName());
        System.out.println("Price: " + product5.getPrice());
        System.out.println("ID: " + product5.getId());
    }
}