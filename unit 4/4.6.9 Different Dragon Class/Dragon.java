public class Dragon 
{
    private String name;
    private int level;
    private boolean canBreatheFire;
    
    // Write the constructor here!
    public Dragon(String x, int y)
    {
        name = x;
        level = y;
    }
    
    // Put getters here
    public String getName()
    {
        return name;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public boolean isFireBreather()
    {
        if(level>=70)
        {
            canBreatheFire = true;
        }
        
        return canBreatheFire;
    }
    
    // Put other methods here
    public void attack()
    {
        if(isFireBreather())
        {
            System.out.println(">>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>>>>>");
            System.out.println(">>>>>>>>>>");
        }
        else
        {
            System.out.println("~ ~ ~");
        }
    }
    
    public void gainExperience()
    {
        level += 10;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon " + name + " is at level " + level;
    }
}
