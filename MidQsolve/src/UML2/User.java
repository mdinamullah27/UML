
package UML2;

public class User {
    protected String UserID,Password;
    
     public void User(String UserID,String Password)
     {
         this.UserID=UserID;
         this.Password=Password;
     }
     public void display()
    {
        System.out.println("User Details: ");
        System.out.println("UserID   : "+this.UserID);
        System.out.println("password : "+this.Password);
        System.out.println("\n\n");
    }
}
