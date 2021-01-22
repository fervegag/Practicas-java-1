
import java.util.Scanner;

public class EjercicioTiposPrimitivos {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        var nombre = lectura.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(lectura.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(lectura.nextLine());
        System.out.println("Porporcioan el simbolo:");
        char simbolo = lectura.nextLine().charAt(0);
        System.out.println("Proporciona el envío gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(lectura.nextLine());
        System.out.println("\nTicket:\n");
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envío Gratuito: " + envioGratuito);

    }
}
