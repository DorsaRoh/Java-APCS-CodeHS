public class Fraction
{
    // Create your instance variables and constructor here

    private int num;
    private int den;

    
    public Fraction(int numerator, int denominator)
    {
       num = numerator;
       den = denominator;
    }
    
 
    
    public int getNumerator()
    {
       return num;
    }
    
    public int getDenominator()
    {
       return den;
    }
    
    public void setNumerator(int x)
    {
       num = x;
    }
    
    public void setDenominator(int x)
    {
        den = x;
    }
    
    public void add(Fraction other)
    {
        int firstNum = num * other.getDenominator();
        int secondNum = den * other.getNumerator();
        
        num = firstNum + secondNum;
        den = den * other.getDenominator();
    }
    
    public void subtract(Fraction other)
    {
        int firstNum = num * other.getDenominator();
        int secondNum = den * other.getNumerator();
        
        num = firstNum - secondNum;
        den = den * other.getDenominator();
    }
    
    public void multiply(Fraction other)
    {
        int firstNum = num * other.getNumerator();
        int firstDen = den * other.getDenominator();
        
        num = firstNum;
        den = firstDen;
    }
    
    
    public String toString() 
    {
        return num + "/" + den;
    }
}
