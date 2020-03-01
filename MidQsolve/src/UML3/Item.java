
package UML3;
public class Item {
    private String Itemname;
    private double price;

    public Item(String Itemname,double price) {
        this.Itemname = Itemname;
         this.price = price;
    }
    public String getItemname() {
        return Itemname;
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
