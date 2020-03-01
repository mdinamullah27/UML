
package Summer19;


public class Cuastomer {
    private String customerId, password;

    public Cuastomer(String customerId, String password) {
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
