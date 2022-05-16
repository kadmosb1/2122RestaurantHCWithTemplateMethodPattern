import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Meal> meals = new ArrayList<> ();

    public static void seed () {
        ArrayList<Extra> dessert = new ArrayList<> ();
        dessert.add (new Dessert ());
        ArrayList<Extra> sodaAndFries = new ArrayList<> ();
        sodaAndFries.add (new Soda ());
        sodaAndFries.add (new Fries ());
        ArrayList<Extra> all = new ArrayList<> (sodaAndFries);
        all.addAll (dessert);

        meals.add (new Hamburger (dessert));
        meals.add (new Hamburger (null));
        meals.add (new Special (all));
        meals.add (new Special (sodaAndFries));
        meals.add (new VegatarianBurger (null));
        meals.add (new VegatarianBurger (dessert));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int menukeuze = 1;
        seed ();

        System.out.println("Welke maaltijd wil de klant bestellen?");
        System.out.println ();

        for (Meal meal : meals) {
            System.out.println (menukeuze + ". " + meal.getName());
            menukeuze++;
        }

        System.out.println ();
        System.out.print("Welke maaltijd? ");
        menukeuze = scanner.nextInt();
        scanner.nextLine ();

        Meal meal = meals.get (menukeuze - 1);
        String order = meal.getOrder ();
        System.out.println (order);
    }
}