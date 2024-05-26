package store;

public class Manager implements Employee {
    private final String firstName;
    private final String lastName;
    private final int id;

    // Constructor
    public Manager(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Override work method
    @Override
    public void work() {
        System.out.println("Manager " + firstName + " " + lastName + " is managing the store.");
    }

    // Override getDetails method
    @Override
    public String getDetails() {
        return "Manager ID " + id + ", Name: " + firstName + " " + lastName;
    }
}