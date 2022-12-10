public class Dragon 
{
    private String attack;
    private int level;
    private String str = "";
    
    public Dragon(int x, String y)
    {
        level = x;
        attack = y;
    }
    
    public int getLevel()
    {
        return level;
    }
    
    public String getAttack()
    {
        return attack;
    }
    
    public String fight()
    {
        for(int i = 0; i < level; i++)
        {
            str += attack;
        }
        
        System.out.println(str);
        return str;
    }
    

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}
