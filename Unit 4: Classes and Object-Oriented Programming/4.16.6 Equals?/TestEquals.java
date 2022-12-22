public class TestEquals extends ConsoleProgram
{
    public void run()
    {
        System.out.println("** Object **");
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;
        
        // Print out all three objects
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        
        // Write a true statement using 2 objects and ==
        System.out.println(obj1 == obj3);
        
        // Write a false statement using 2 objects and ==
        System.out.println(obj1 != obj3);
        
        // Write a true statement using 2 objects and .equals()
        System.out.println(obj1.equals(obj3));
        
        // Write a false statement using 2 objects and .equals()
        System.out.println(!obj1.equals(obj3));
        
        System.out.println("** Ball **");
        
        
        Ball ball1 = new Ball("Red");
        Ball ball2 = new Ball("Red");
        Ball ball3 = ball1;
        
        // Print out all three objects
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
        
         // Write a true statement using 2 objects and ==
        System.out.println(ball1 == ball3);
        
        // Write a false statement using 2 objects and ==
        System.out.println(ball1 != ball3);
        
        // Write a true statement using 2 objects and .equals()
        System.out.println(ball1.equals(ball3));
        
        // Write a false statement using 2 objects and .equals()
        System.out.println(!ball1.equals(ball3));

    }
}
