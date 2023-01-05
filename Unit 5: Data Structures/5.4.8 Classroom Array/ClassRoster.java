public class ClassRoster extends ConsoleProgram
{
    public void run()
    {
        Student julian = new Student("Julian", "Jones", 9);
        Student larisa = new Student("Larisa", "Torres", 10);
        Student amada = new Student("Amada", "Robin", 10);
        Student mikka = new Student("Mikka", "Leads", 9);
        Student jay = new Student("Jay", "Khalil", 10);
        
        Student[] classroom = {julian, larisa, amada, mikka, jay};

        for(Student students : classroom){
            System.out.println(students.getFirstName() + " " + students.getLastName() + " is in grade " + students.getGradeLevel());
        }
        
    }
}
