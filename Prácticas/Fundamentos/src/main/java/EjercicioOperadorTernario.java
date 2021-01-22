
import java.util.Scanner;

public class EjercicioOperadorTernario {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Proporciona el numero1");
        int num1 = Integer.parseInt(lectura.nextLine());
        System.out.println("Proporciona el numero2");
        int num2 = Integer.parseInt(lectura.nextLine());
        int numeroMayor = (num1 > num2) ? num1 : num2;
        System.out.println("numeroMayor = " + numeroMayor);
    }

}
