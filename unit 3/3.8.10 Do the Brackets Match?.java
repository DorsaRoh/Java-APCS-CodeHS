
public boolean bracketsMatch(String str)
    {
        
        int count = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            
            char ch = str.charAt(i);
            
            if(ch == '{')
            {
                count ++;
            }
            
            else if(ch == '}')
            {
                count --;
            }
            
            if(count < 0)
            {
            return false;
            }
            
        }
        
        return count == 0;
    }


