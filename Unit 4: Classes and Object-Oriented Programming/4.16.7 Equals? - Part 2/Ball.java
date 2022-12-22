public class Ball
{
   private String color;
   
   public Ball(String color){
       this.color = color;
   }
   
   public String getColor(){
       return color;
   }
   
   // Write a equals method here that returns true if
   // the colors are the same.
   public boolean equals(Ball other)
   {
       Ball otherBall = (Ball) other;
       return getColor().equals(otherBall.getColor());
   }
   
   
   // Write a toString statement here, for example:
   // Color: Red
   
   public String toString(){
       return "Color: " + color;
   }
   
}
