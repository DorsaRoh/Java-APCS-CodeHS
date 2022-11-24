public String altCase(String word)
    {
        String result = "";
        
        for(int i = 0; i < word.length(); i++)
        {
            if(i%2==0)
            {
                result += Character.toUpperCase(word.charAt(i));
            }
            else
            {
                result += Character.toLowerCase(word.charAt(i));
            }
        }
        return result;
    }
