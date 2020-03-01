/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring19;

public class Item {
    private String Itemname;
    private double price;

    public String getItemname() {
        return Itemname;
    }

    public  Item(String Itemname,double price) {
        this.Itemname = Itemname;
         this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display()
    {
        System.out.println("Itemname :"+this.getItemname());
        System.out.println("price : "+this.getPrice());
    }
}
