public class Messages extends ConsoleProgram
{
    public void run()
    {
        // Your code here.
        // Create the two TextMessage objects and print them out.
        
        TextMessage myMessage1 = new TextMessage("Dorsa", "Mahsa", "Hi");
        System.out.println(myMessage1);
        
        TextMessage myMessage2 = new TextMessage("Mahsa", "Dorsa", "Hello");
        System.out.println(myMessage2);
    }
}
