public class Scratchpad extends ConsoleProgram
{
    public void run()
    {
        int[] array = new int[5];
        getLastElement(array);
    }

    public int getLastElement(int[] arr)
    {
        return arr[arr.length - 1];
    }
}
