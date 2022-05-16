import java.util.ArrayList;

public class Hamburger extends Meal {

    public Hamburger (ArrayList<Extra> extras) {
        super ("Broodje hamburger", extras);
    }

    @Override
    public String getOrderLine() {
        return "";
    }
}