import java.util.ArrayList;
import java.util.Scanner;

public class Special extends Meal {

    public Special(ArrayList<Extra> extras) {
        super("Broodje hamburger speciaal", extras);
    }

    @Override
    public String getOrderLine() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Wil de klant curry of ketchup bij het broodje hamburger speciaal? ");
        return "= Saus: " + scanner.nextLine () + "\r\n";
    }
}
