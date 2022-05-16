import java.util.Scanner;

public class Special extends Meal {

    public Special(boolean withSodaAndFries) {
        super("Broodje hamburger speciaal", withSodaAndFries);
    }

    @Override
    public String getOrderLine() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Wil de klant curry of ketchup bij het broodje hamburger speciaal? ");
        return "= Saus: " + scanner.nextLine () + "\r\n";
    }
}
