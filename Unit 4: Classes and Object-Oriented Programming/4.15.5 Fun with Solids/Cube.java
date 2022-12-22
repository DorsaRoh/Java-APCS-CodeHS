public class Cube extends RectangularPrism
{
    private double length;
    private double sideLength;
    
    public Cube(String name, double length)
    {
        super(name, length, length, length);
        this.length = length;
    }
    
    public double volume()
    {
        return Math.pow(length,3);
    }
    
    public double surfaceArea(){
        return 6*length*length;
    }
}
