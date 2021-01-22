
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Inglese el titulo del libro:");
        var titulo = lectura.nextLine();
        System.out.println("Inglese el autor del libro:");
        var autor = lectura.nextLine();

        System.out.println("\n" + titulo + " fue escrito por " + autor);

    }

}
