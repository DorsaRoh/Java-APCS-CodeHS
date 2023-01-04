public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getMostImprovedStudent()
    {
        int index = 0;
        int tracker = 0;
        for(int i = 0; i < numStudentsAdded; i++){
            if(students[i].getExamRange() > tracker){
                tracker = students[i].getExamRange();
                index = i;
            }
        }
        return students[index];
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
