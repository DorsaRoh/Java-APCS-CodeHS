public static String doubleVowel(String str) 
    {
        return str.replaceAll("([AaEeIiOoUu])", "$1$1");
    }
