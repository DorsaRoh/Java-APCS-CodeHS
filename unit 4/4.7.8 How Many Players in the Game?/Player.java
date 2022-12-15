public class Player 
{
    // Static Variables
    public static int totalPlayers = 0;
    public static int maxPlayers = 10;
    
    // Public Methods
    public Player() 
    {
        totalPlayers++;
    }
    
    // Static Methods 
    public static boolean gameFull()
    {
        return totalPlayers >= maxPlayers;
    }
}
