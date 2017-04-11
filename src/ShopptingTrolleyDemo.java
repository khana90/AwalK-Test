
/**
 *
 * @author Awal khan
 */
public class ShopptingTrolleyDemo {
    
    public static void main (String[]args) {
        
        ShoppingTrolley a= new ShoppingTrolley ("Bananas", "ASDA","Organic Bananas", 1.16); 
        //ShoppingTrolley b = new ShoppingTrolley (" Broccoli", "ASDA", "Loose Braccoli", 0.79);   
        
         System.out.println("shoppings in trolley are..." + "...");

        System.out.println("itemName:" + a.getItemName());
        System.out.println("itemproducer:" + a.getItemProducer());
        System.out.println("ItemDescription:" + a.getItemDescription());
        System.out.println("itemPrice:" + a.getItemPrice());
}
}
