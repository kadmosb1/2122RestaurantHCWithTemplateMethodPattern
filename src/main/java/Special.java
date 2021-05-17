import java.util.Scanner;

public class Special extends Meal {

    public Special (int keuze) {
        super (keuze, "Broodje hamburger speciaal");
    }

    public String getOrderLine () {
        System.out.print ("Wil de klant curry of ketchup bij het broodje hamburger speciaal? ");
        Scanner scanner = new Scanner(System.in);
        return "= Saus: " + scanner.nextLine () + "\r\n";
    }
}
