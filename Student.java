public class Student extends Person 
{
    private String studentId;

    public Student(String name, String photoPath, String studentId) 
    {
        super(name, photoPath);
        this.studentId = studentId;
    }

    public String getStudentId() 
    {
        return studentId;
    }

    @Override
    public String getRole() 
    {
        return "Student";
    }
}
