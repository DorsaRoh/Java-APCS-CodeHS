import java.lang.Math;

public class Sphere extends Solid
{
    private double radius;
    
    public Sphere(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }
    
    public double volume()
    {
        return (4*radius*radius*radius*Math.PI)/3;
    }
    
    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}
