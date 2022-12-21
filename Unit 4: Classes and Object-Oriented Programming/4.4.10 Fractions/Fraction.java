public class Fraction
{
       private int num;
       private int den;
       
       public Fraction(int numerator, int denominator)
       {
           num = numerator;
           den = denominator;
       }
       
       public String toString()
       {
           return num + "/" + den;
       }
}
