import java.util.Scanner;

public abstract class Meal {

    private String name;
    private boolean withSoda = false;
    private boolean withFries = false;

    public Meal (String name, boolean withSodaAndFries) {

        this.name = name;

        if (withSodaAndFries) {
            this.name += " met fris en frites";
            withSoda = true;
            withFries = true;
        }
    }

    public String getName () {
        return name;
    }

    public abstract String getOrderLine ();

    public String getOrder () {

        Scanner scanner = new Scanner (System.in);

        String order = "\r\n===============================================\r\n";
        order += "= Bestelling: " + name + "\r\n";
        order += getOrderLine ();

        if (withSoda) {
            System.out.print ("Welk drinken wil de klant bij zijn maaltijd? ");
            order += "= Drank: " + scanner.nextLine () + "\r\n";
        }

        if (withFries) {
            System.out.print ("Wil de klant fritessaus bij de frites (j/n) ");
            order += "= Extra fritessaus: " + (scanner.nextLine ().equals ("j") ? "ja" : "nee") + "\r\n";
        }

        return order + "===============================================";
    }
}
