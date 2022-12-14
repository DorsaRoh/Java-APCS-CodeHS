public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
        values = theValues;
   }

   public double getAverage()
   {
       double total = 0;
        for(double value : values){
            total += value;
        }
        return total/values.length;
   }
}
