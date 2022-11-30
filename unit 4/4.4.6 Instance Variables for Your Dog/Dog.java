public class Dog 
{
    private String breed;
    private String name;
    
    public Dog(String theBreed, String theName)
    {
        breed = theBreed;
        name = theName;
    }
    
    public String toString()
    {
        return name + " is a " + breed;
    }
}
