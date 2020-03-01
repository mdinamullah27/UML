
package Spring2018;


public class Item {
    private String ItemId;
    private double price;

    public Item(String ItemId, double price) {
        this.ItemId = ItemId;
        this.price = price;
    }

    public String getItemId() {
        return ItemId;
    }
    public double getPrice() {
        return price;
    }
  public void display()
  {
      System.out.println("ItemId: "+this.getItemId());
      System.out.println("price: "+this.getPrice());
  }
    
}
