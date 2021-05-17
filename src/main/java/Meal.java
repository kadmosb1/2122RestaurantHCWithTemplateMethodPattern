public abstract class Meal {

    private String name;
    private Soda soda;
    private Fries fries;

    public Meal (int keuze, String name) {

        this.name = name;

        if ((keuze == 2) || (keuze == 4)) {
            this.name += " met fris en frites";
            soda = new Soda ();
            fries = new Fries ();
        }
    }

    public String getName () {
        return name;
    }

    public abstract String getOrderLine ();

    public String getOrder () {

        String bestelling = "\r\n===============================================\r\n";
        bestelling += "= Bestelling: " + getName () + "\r\n";
        bestelling += getOrderLine ();

        if (soda != null) {
            bestelling += soda.getOrderLine ();
        }

        if (fries != null) {
            bestelling += fries.getOrderLine ();
        }

        return bestelling + "===============================================";
    }
}
