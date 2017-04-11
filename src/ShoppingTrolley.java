
/**
 *
 * @author Awal khan
 */
public class ShoppingTrolley {
    
   private String itemName;
   private String itemProducer;
   private String itemDescription;
   private double itemPrice;
   
   
   //constructor 
   public ShoppingTrolley (String itemName, String itemProducer ,String itemDescription, double itemPrice) {
    
    this.itemName=itemName;
    this.itemProducer=itemProducer;
    this.itemDescription =itemDescription;
    this.itemPrice=itemPrice;
}   
   
   //getters

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @return the itemProducer
     */
    public String getItemProducer() {
        return itemProducer;
    }

    /**
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }
   
    //setters

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @param itemProducer the itemProducer to set
     */
    public void setItemProducer(String itemProducer) {
        this.itemProducer = itemProducer;
    }

    /**
     * @param itemDescription the itemDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    //toString
    public String toString (){
        
        return ("shows item's name"+ itemName)
                + (" shows Producer of item (which company created it)"+ itemProducer)
                + ("shows item description"+ itemDescription)
                + ("shows item price"+ itemPrice);
    }
   
}
