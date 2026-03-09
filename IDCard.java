public class IDCard 
{
    private Person person;
    private String qrCode; 
    private boolean isApproved;

    public IDCard(Person person, String qrCode) 
    {
        this.person = person;
        this.qrCode = qrCode;
        this.isApproved = false;
    }

    public String getQrCode() 
    {
        return qrCode;
    }

    public void approve() 
    {
        isApproved = true;
    }

    public boolean isApproved() 
    {
        return isApproved;
    }

    public void displayCard() 
    {
        System.out.println("----- Digital ID Card -----");
        System.out.println("Name: " + person.getName());
        System.out.println("Role: " + person.getRole());
        System.out.println("Photo: " + person.getPhotoPath());
        System.out.println("QR Code: " + qrCode);
        System.out.println("Status: " + (isApproved ? "Approved" : "Pending"));
        System.out.println("---------------------------");
    }

    public Person getPerson() 
    {
        return person;
    }
}
