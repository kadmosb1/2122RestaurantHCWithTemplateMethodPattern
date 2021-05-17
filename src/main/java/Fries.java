import java.util.Scanner;

public class Fries {

    public String getOrderLine () {
        System.out.print ("Wil de klant fritessaus bij de frites (j/n) ");
        Scanner scanner = new Scanner(System.in);
        return "= Extra fritessaus: " + (scanner.nextLine ().equals ("j") ? "ja" : "nee") + "\r\n";
    }
}
