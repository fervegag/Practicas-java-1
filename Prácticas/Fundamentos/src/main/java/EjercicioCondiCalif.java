
import java.util.Scanner;

public class EjercicioCondiCalif {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double num = 0.0;
        System.out.println("Proporcione un valor entre 0 y 10: ");
        num = Double.parseDouble(lectura.nextLine());
        if (num >= 9 && num <= 10) {
            System.out.println("A");
        } else if (num >= 8 && num < 9) {
            System.out.println("B");
        } else if (num >= 7 && num < 8) {
            System.out.println("C");
        } else if (num >= 6 && num < 7) {
            System.out.println("D");
        } else if (num >= 0 && num < 6) {
            System.out.println("F");
        } else {
            System.out.println("Valor desconocido");
        }
    }

}
