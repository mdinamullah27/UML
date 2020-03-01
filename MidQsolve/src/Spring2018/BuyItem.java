
package Spring2018;

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
    public static void main(String[] args) {
      Item I1=new Item("A",100); 
      Item I2=new Item("B",110); 
      Item I3=new Item("C",120); 
      Item I4=new Item("D",130); 
      ArrayList<Item> I=new ArrayList<>();
      I.add(I1);
      I.add(I2);
      I.add(I3);
      I.add(I4);
      
      Customer c=new Customer("ianm","12345");
      c.display();
      BuyItem b=new BuyItem("03-03-2020",5);
      b.display(I);
      
    }
}
