public class ExtremeMain extends ConsoleProgram
{
    public void run()
    {
        
        // Create an Extremes object
        Extremes obj = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        int maxGuess = readInt("Guess the maximum Integer value: ");
        
        // Compute and display the difference
        // between the max and the guess
        System.out.println("You were off by " + obj.maxDiff(maxGuess));
        
        // Ask the user to guess the minimum value of an Integer
        int minGuess = readInt("Guess the minimum Integer value: ");
        
        // Compute and display the difference 
        // between the min and the guess
        System.out.println("You were off by " + Math.abs(obj.minDiff(minGuess)));
    }
}
