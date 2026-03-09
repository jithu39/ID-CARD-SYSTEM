public class Admin 
{

    public void approveAll(IDCard[] cards, int total) 
    {
        for (int i = 0; i < total; i++) 
        {
            if (!cards[i].isApproved()) 
            {
                cards[i].approve();
                System.out.println("Approved ID for " + cards[i].getPerson().getName());
            }
        }
    }

    public void verifyQR(IDCard[] cards, int total, String code) 
    {
        for (int i = 0; i < total; i++) 
        {
            if (cards[i].getQrCode().equals(code)) 
            {
                if (cards[i].isApproved()) 
                {
                    System.out.println("QR Code valid.");
                    cards[i].displayCard();
                } else 
                {
                    System.out.println("ID not yet approved.");
                }
                return;
            }
        }
        System.out.println("QR Code not found.");
    }
}
