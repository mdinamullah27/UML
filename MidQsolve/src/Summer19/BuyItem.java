
package Summer19;


import java.util.ArrayList;

public class BuyItem {
    private String BuyDate;
    private int quantiry;

    public String getBuyDate() {
        return BuyDate;
    }

    public int getQuantiry() {
        return quantiry;
    }

    public BuyItem(String BuyDate, int quantiry) {
        this.BuyDate = BuyDate;
        this.quantiry = quantiry;
    }
  public void display(ArrayList<Item> i)
  {
      System.out.println("BuyDate: "+this.getBuyDate());
      System.out.println("quantiry: "+this.getQuantiry());
      
      for(Item I:i)
      {
          I.display();
      }
  }
    
}