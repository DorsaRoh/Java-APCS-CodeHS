public class Pizza
{
    private String type;
    private String toppings;
    private int size;
    
    
    public Pizza(String theType, String theToppings, int theSize)
    {
        type = theType;
        toppings = theToppings;
        size = theSize;
    }
    
    
    public String toString()
    {

        return "The pizza is " + type + " and has toppings of " + toppings + " and is " + size + " large.";
    }
}
