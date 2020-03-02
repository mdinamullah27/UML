
package fall2019;

public class Customer {
    private String customerId, password;

    public void User(String customerId, String password) {
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
