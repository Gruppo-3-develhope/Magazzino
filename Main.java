import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Seleziona un'operazione:");
                System.out.println("1. Aggiungi prodotto al magazzino");
                System.out.println("2. Scarica merce dal magazzino");
                System.out.println("3. Crea carrello");
                System.out.println("4. Aggiungi elemento al carrello");
                System.out.println("0. Esci");

                int opzione = scanner.nextInt();

                switch (opzione) {
                    case 1:
                        System.out.print("Inserisci il nome del prodotto: ");

                        break;

                    case 2:
                        System.out.print("Inserisci il nome del prodotto da scaricare: ");

                        break;

                    case 3:

                        System.out.println("Carrello creato.");
                        break;

                    case 4:
                        System.out.println("ciao");
                        break;

                    case 0:
                        System.out.println("Uscita dal programma.");
                        System.exit(0);
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Errore: inserisci un numero valido.");
                scanner.next();
            }
        }
    }
}