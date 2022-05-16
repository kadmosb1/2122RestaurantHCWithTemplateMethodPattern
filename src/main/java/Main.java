import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Meal> meals = new ArrayList<> ();

    public static void seed () {
        meals.add (new Hamburger (false));
        meals.add (new Hamburger (true));
        meals.add (new Special (false));
        meals.add (new Special (true));
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