public class Fraction implements Comparable<Fraction>
{

    private int num;
    private int den;

    
    public Fraction(int num, int den)
    {
       this.num = num;
       this.den = den;
    }
    
 
    public int compareTo(Fraction other){
        double diff = ((double)getNumerator()/(double)getDenominator())-((double)other.getNumerator()/(double)other.getDenominator());
        return (int)Math.signum(diff);
    }


    public boolean equals(Object other){
        return other instanceof Fraction && compareTo((Fraction)other) == 0;
    }
    
    public int getNumerator()
    {
       return num;
    }
    
    public int getDenominator()
    {
       return den;
    }
    
    
    public String toString() 
    {
        return num + "/" + den;
    }
}
