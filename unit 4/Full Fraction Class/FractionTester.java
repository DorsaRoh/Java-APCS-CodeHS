public class FractionTester extends ConsoleProgram
{
    public void run()
    {
        Fraction first = new Fraction(1, 2);
        Fraction second = new Fraction(1, 3);
        System.out.println();
        System.out.println("BEFORE:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        first.add(second);
        System.out.println("AFTER:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        
    }
}
