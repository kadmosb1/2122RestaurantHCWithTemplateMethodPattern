public class Hamburger extends Meal {

    public Hamburger (boolean withSodaAndFries) {
        super ("Broodje hamburger", withSodaAndFries);
    }

    @Override
    public String getOrderLine() {
        return "";
    }
}
