public class CoinFlips extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
    
    int countHeads = 0;
    int countTails = 0;
    
    for(int i = 0; i < 100; i++)
    {
        boolean coinFlip = Randomizer.nextBoolean();
        
        if(coinFlip == true)
        {
            countHeads ++;
            System.out.println("Heads");
        }
        else
        {
            countTails ++;
            System.out.println("Tails");
        }
    }
    
    System.out.println("heads " + countHeads);
    System.out.println("tails " + countTails);
    
    double newHeads = (double)countHeads;
    double newTails = (double)countTails;
    
    
    System.out.println("% Heads: " + newHeads/100);
    System.out.println("% Tails: " + newTails/100);
    

    }
}
