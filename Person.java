
public abstract class Person 
{
    protected String name;
    protected String photoPath;

    public Person(String name, String photoPath) 
    {
        this.name = name;
        this.photoPath = photoPath;
    }

    public String getName() 
    {
        return name;
    }

    public String getPhotoPath() 
    {
        return photoPath;
    }

    public abstract String getRole();
}
