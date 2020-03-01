/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring19;

public class User {
    protected String UserID,Password;
    
     public User(String UserID,String Password)
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

