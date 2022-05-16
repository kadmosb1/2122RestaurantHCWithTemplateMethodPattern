import java.util.Scanner;

public class Meal {

    public static final int SPECIAL = 1;
    public static final int HAMBURGER = 2;
    private int type = HAMBURGER;
    private String name = "Broodje hamburger";
    private boolean withSoda = false;
    private boolean withFries = false;

    public Meal (int type, boolean withSodaAndFries) {

        if (type == SPECIAL) {
            this.type = type;
            name += " speciaal";
        }

        if (withSodaAndFries) {
            name += " met fris en frites";
            withSoda = true; withFries = true;
        }
    }

    public String getName () {
        return name;
    }

    public String getOrder () {

        Scanner scanner = new Scanner(System.in);

        String order = "\r\n===============================================\r\n";
        order += "= Bestelling: " + getName () + "\r\n";

        if (type == SPECIAL) {
            System.out.print ("Wil de klant curry of ketchup bij het broodje hamburger speciaal? ");
            order += "= Saus: " + scanner.nextLine () + "\r\n";
        }

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
