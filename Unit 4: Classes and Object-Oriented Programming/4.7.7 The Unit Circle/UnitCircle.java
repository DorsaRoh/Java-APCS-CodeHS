public class UnitCircle extends ConsoleProgram
{
    public void run()
    {
        double value = 0.431675;
        value = Math.round(value * 100) / 100.0;
        
        System.out.println("Radians: (cos, sin)");
        
        for(value = 0; value < 2*Math.PI; value+=(Math.PI/4))
        {
            System.out.println(value + ": " + Math.cos(value) + ", " + Math.sin(value));
        }
    }

}
