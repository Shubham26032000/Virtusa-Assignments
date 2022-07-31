package Assignemnt2;

public class Customer extends Exception {
    private String name;
    private String id;
    private String address;
    private String email;

    private String errorMessage;

    public Customer() {
    }

    public Customer(String name, String id, String address, String email) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.email = email;
    }

    public Customer(String error) {
        this.errorMessage = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("-------------------------------------------------");
        System.out.println("Name : " + name);
        System.out.println("Customer ID : " + id);
        System.out.println("Address : " + address);
        System.out.println("Email : " + email);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.errorMessage;
    }
}
