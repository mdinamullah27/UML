
package UML3;

public class User {
    protected String UserID,Password;

    public String getUserID() {
        return UserID;
    }

    public String getPassword() {
        return Password;
    }
    
     public User(String UserID,String Password)
     {
         this.UserID=UserID;
         this.Password=Password;
     }
     public void display()
    { 
        System.out.println("User Details: ");
        System.out.println("UserID   : "+this.getUserID());
        System.out.println("password : "+this.getPassword());
        System.out.println("\n\n");
    }
}
