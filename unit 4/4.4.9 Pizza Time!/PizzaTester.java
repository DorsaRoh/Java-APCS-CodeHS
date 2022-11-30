public class PizzaTester extends ConsoleProgram
{
    public void run()
    {
        Pizza pepperoniPizza = new Pizza("pepperoni", "pepper", 10);
        Pizza cheesePizza = new Pizza("cheese", "mayo", 12);
        Pizza pineapplePizza = new Pizza("pineapple", "lettuce", 5);
        
        
        System.out.println(pepperoniPizza);
        System.out.println(cheesePizza);
        System.out.println(pineapplePizza);
    }
}
