public class Fraction
{
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
       
       public String toString()
       {
           return num + "/" + den;
       }
}
