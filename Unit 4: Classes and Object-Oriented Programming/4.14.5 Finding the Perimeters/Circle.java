public class Circle extends Shape
{
    private double radius;

    public Circle(String name, double radius)
    {
        super(name);
        this.radius = radius;
    }

    public Circle(double radius)
    {
        this("Circle", radius);
    }

    public double getRadius()
    {
        return radius;
    }
    
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
}
