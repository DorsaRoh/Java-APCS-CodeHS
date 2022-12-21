public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
    
    private String getWinner(String user, String computer)
    {
        // Return the proper string for the result.
        String USER_PLAYER = "User wins!";
        String COMPUTER_PLAYER = "Computer wins!";
        String TIE = "Tie";
    
    
        if(user.equals(computer)) return TIE;
        
        else if(user.equals("paper") && computer.equals("rock"))
        {
            return USER_PLAYER;
        }
        else if(computer.equals("paper") && user.equals("rock"))
        {
            return COMPUTER_PLAYER;
        }
        else if(user.equals("scissors") && computer.equals("paper"))
        {
            return USER_PLAYER;
        }
        
        else if(user.equals("rock") && computer.equals("scissors"))
        {
            return USER_PLAYER;
        }
        
        else
        {
            return COMPUTER_PLAYER;
        }
        
    }

    
    private String getComputer(){
        int random = Randomizer.nextInt(0,3);
        if(random == 1) return "rock";
        else if(random == 2) return "scissors";
        return "paper";
    }
    
    public void run()
    {
        user();
    }
    
    public void user()
    {
        String userInp = readLine("Enter your choice (rock, paper, or scissors): ");
        if(userInp.equals(""))
        {
            System.out.println("Thanks for playing!");
            return;
        }
        
        
        System.out.println("User: " + userInp);
        
        String x = getComputer();
        System.out.println("Computer: " + x);
        
        System.out.println(getWinner(userInp, x));
        user();
        
    }
}
