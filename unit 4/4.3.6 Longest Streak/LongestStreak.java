public class LongestStreak extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
    
    int countStreak = 0;
    int longestStreak= 0;
    
    for(int i = 0; i < FLIPS; i++)
    {
        boolean coinFlip = Randomizer.nextBoolean();
        
        if(coinFlip == true)
        {
            System.out.println("Heads");
            countStreak++;
            
            if(countStreak > longestStreak)
            {
                longestStreak = countStreak;
            }
        }
        else
        {
            System.out.println("Tails");
            countStreak = 0;
        }
    }
    
    System.out.println("Longest streak of heads: " + longestStreak);

    }
}
