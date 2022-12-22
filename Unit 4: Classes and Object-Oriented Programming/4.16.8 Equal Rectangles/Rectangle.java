public class Rectangle{

    private int width;
    private int height;
     
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
   // Add toString and equals methods
   
   public boolean equals(Rectangle other){
       return width == other.width && height == other.height;
   }
   
   public String toString(){
       return "A rectangle with a width of " + width + " and a height of "  + height;
   }
   
}
