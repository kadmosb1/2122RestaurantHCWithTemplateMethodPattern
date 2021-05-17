import java.util.Scanner;

public class Soda {

    public String getOrderLine () {
        System.out.print ("Welk drinken wil de klant bij zijn maaltijd? ");
        Scanner scanner = new Scanner(System.in);
        return "= Drank: " + scanner.nextLine () + "\r\n";
    }
}
