public class Faculty extends Person 
{
    private String facultyId;

    public Faculty(String name, String photoPath, String facultyId) 
    {
        super(name, photoPath);
        this.facultyId = facultyId;
    }

    public String getFacultyId() 
    {
        return facultyId;
    }

    @Override
    public String getRole() 
    {
        return "Faculty";
    }
}
