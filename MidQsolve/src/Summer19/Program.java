
package Summer19;

import java.util.ArrayList;


public class Program {
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
      
      Cuastomer c=new Cuastomer("ianm","12345");
      c.display();
      BuyItem b=new BuyItem("03-03-2020",5);
      b.display(I);
      
    }
}
