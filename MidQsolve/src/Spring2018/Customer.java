
package Spring2018;


public class Customer {
    private String customerId, password;

    public Customer(String customerId, String password) {
        this.customerId = customerId;
        this.password = password;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPassword() {
        return password;
    }
    public void display()
    {
        System.out.println("customerId: "+this.getCustomerId());
        System.out.println("password "+this.getPassword());
    }
}
