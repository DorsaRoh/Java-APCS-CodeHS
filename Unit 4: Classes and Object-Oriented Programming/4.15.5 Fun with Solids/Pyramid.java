import java.lang.Math;

public class Pyramid extends Solid
{
    private double length;
    private double width;
    private double height;
    
    public Pyramid(String name, double length, double width, double height)
    {
        super(name);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double volume()
    {
        return length*width*height/3;
    }
    
    // When testing, values will be passed in this order: length, width, height
    
    
    public double surfaceArea(){
        return length*width+(length*Math.sqrt((width/2)*(width/2)+(height)*(height))+width*Math.sqrt((length/2)*(length/2)+(height)*(height)));
    }
}
