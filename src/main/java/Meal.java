import java.util.ArrayList;
import java.util.Scanner;

public abstract class Meal {

    private String name;
    private ArrayList<Extra> extras = new ArrayList<> ();

    public Meal (String name, ArrayList<Extra> extras) {

        this.name = name;

        StringBuilder string = new StringBuilder ();

        if (extras != null) {
            this.extras = extras;
        }

        if ((extras != null) && (extras.size () > 0)) {

            for (int teller = 0; teller < extras.size (); teller++) {

                if (teller == 0) {
                    string.append (" (met ");
                }
                else if (teller == (extras.size () - 1)) {
                    string.append (" en ");
                }
                else {
                    string.append (", ");
                }

                string.append (extras.get (teller).getName ());
            }

            string.append (")");
            this.name += string;
        }
    }

    public String getName () {
        return name;
    }

    public abstract String getOrderLine ();

    public String getOrder () {

        Scanner scanner = new Scanner (System.in);
        StringBuilder order = new StringBuilder ();
        order.append ("\r\n===============================================\r\n");
        order.append ("= Bestelling: ").append (name).append ("\r\n");
        order.append (getOrderLine ());

        for (Extra extra : extras) {
            order.append (extra.getOrderLine ());
        }

        order.append ("===============================================");
        return order.toString ();
    }
}
