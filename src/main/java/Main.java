import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welke maaltijd wil de klant bestellen?");
        System.out.println ();
        System.out.println("1. Broodje hamburger");
        System.out.println("2. Broodje hamburger met fris en frites");
        System.out.println("3. Broodje hamburger speciaal");
        System.out.println("4. Broodje hamburger speciaal met fris en frites");
        System.out.println ();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welke maaltijd? ");
        int keuze = scanner.nextInt();
        scanner.nextLine ();

        Meal meal;

        if ((keuze == 1) || (keuze == 2)) {
            meal = new Hamburger (keuze);
        }
        else {
            meal = new Special (keuze);
        }

        System.out.println (meal.getOrder ());
    }
}