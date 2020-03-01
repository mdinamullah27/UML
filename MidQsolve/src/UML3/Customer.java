package UML3;
///UML  3 summer 18
import java.util.ArrayList;

public class Customer extends User {

     private  String mail;
     private String name;

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public Customer(String mail, String name, String UserID, String Password) {
        super(UserID, Password);
        this.mail = mail;
        this.name = name;
    }
    public void show(ArrayList<Item> i) {
        System.out.println("Customer Details: ");
        System.out.println("Customer name: " + this.getName());
        System.out.println("Customer mail: " + this.getMail());
        System.out.println("\n\n");

        for (Item I : i) {
            I.display();
        }
    }
    public static void main(String[] args) {
      
        Item I1 = new Item("A", 100);
        Item I2 = new Item("B", 100);
        Item I3 = new Item("C", 100);
        Item I4 = new Item("D", 100);
        ArrayList<Item> I = new ArrayList<>();
        I.add(I1);
        I.add(I2);
        I.add(I3);
        I.add(I4);
        Customer c = new Customer("mdinamullah27@gmail.com","Inam Ullah Khan","UserID","Password");     
        c.display();       
         c.show(I);

    }

}
