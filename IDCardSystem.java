import java.util.Scanner;

public class IDCardSystem 
{
    static final int MAX = 100;
    static IDCard[] idCards = new IDCard[MAX];
    static int count = 0;

    static Admin admin = new Admin();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int choice;

        do 
        {
            System.out.println("\n University Digital ID System ");
            System.out.println("1. Generate Student ID");
            System.out.println("2. Generate Faculty ID");
            System.out.println("3. Admin: Approve All IDs");
            System.out.println("4. Verify QR Code");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1:
                    createStudentID();
                    break;
                case 2:
                    createFacultyID();
                    break;
                case 3:
                    admin.approveAll(idCards, count);
                    break;
                case 4:
                    System.out.print("Enter QR Code: ");
                    String code = sc.nextLine();
                    admin.verifyQR(idCards, count, code);
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    static void createStudentID() 
    {
        if (count >= MAX) 
        {
            System.out.println("Limit reached.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Photo Path: ");
        String photo = sc.nextLine();
        System.out.print("Enter Student ID: ");
        String sid = sc.nextLine();

        String qr = "QR" + (count + 1);
        Student s = new Student(name, photo, sid);
        idCards[count++] = new IDCard(s, qr);
        System.out.println("Student ID Created. QR Code: " + qr);
    }

    static void createFacultyID() 
    {
        if (count >= MAX) 
        {
            System.out.println("Limit reached.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Photo Path: ");
        String photo = sc.nextLine();
        System.out.print("Enter Faculty ID: ");
        String fid = sc.nextLine();

        String qr = "QR" + (count + 1);
        Faculty f = new Faculty(name, photo, fid);
        idCards[count++] = new IDCard(f, qr);
        System.out.println("Faculty ID Created. QR Code: " + qr);
    }
}
