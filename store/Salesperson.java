package store;

public class Salesperson implements Employee {
    private final String firstName;
    private final String lastName;
    private final int id;

    // Constructor
    public Salesperson(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Override work method
    @Override
    public void work() {
        System.out.println("Salesperson " + firstName + " " + lastName + " is selling products.");
    }

    // Override getDetails method
    @Override
    public String getDetails() {
        return "Salesperson ID " + id + ", Name: " + firstName + " " + lastName;
    }
}