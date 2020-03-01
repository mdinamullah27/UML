
package Summer19;


public class Item {
    private String Itemname;
    private double price;

    public Item(String Itemname, double price) {
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
      System.out.println("ItemId: "+this.getItemname());
      System.out.println("price: "+this.getPrice());
  }
    
}

