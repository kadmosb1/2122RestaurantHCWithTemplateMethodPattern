import java.util.ArrayList;
import java.util.Scanner;

public class VegatarianBurger extends Meal {

    public VegatarianBurger(ArrayList<Extra> extras) {
        super("Broodje vegetarische burger", extras);
    }

    @Override
    public String getOrderLine() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Wil de klant deze vegetarische burger met speltbrood eten (j/n)? ");
        return "= Broodje: " + (scanner.nextLine ().equals ("j") ? "Speltbrood" : "Gewoon brood") + "\r\n";
    }
}
