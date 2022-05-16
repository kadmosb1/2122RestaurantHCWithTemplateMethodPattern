import java.util.Scanner;

public class Dessert extends Extra {

    @Override
    public String getName() {
        return "toetje";
    }

    @Override
    public String getOrderLine() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Wil de klant een appel of een banaan als toetje? ");
        return "= Toetje: " + scanner.nextLine () + "\r\n";
    }
}
