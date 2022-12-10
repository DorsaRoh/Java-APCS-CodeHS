public class DragonTester extends ConsoleProgram
{
    public void run()
    {
        Dragon dragon1 = new Dragon(10, "fire");
        System.out.println(dragon1.getAttack());
        System.out.println(dragon1.getLevel());
        System.out.println(dragon1.fight());
    }
}
