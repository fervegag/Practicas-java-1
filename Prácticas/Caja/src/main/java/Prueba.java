
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        
        //Variables
        int ancho = 0;
        int alto = 0;
        int profundidad = 0;

        //ingresar valores
        System.out.println("Ingrese el ancho de la caja: ");
        ancho = Integer.parseInt(lectura.nextLine());
        System.out.println("Ingrese el alto de la caja: ");
        alto = Integer.parseInt(lectura.nextLine());
        System.out.println("Ingrese la profundidad de la caja: ");
        profundidad = Integer.parseInt(lectura.nextLine());
        
        //creación de un objeto de la clase Caja
        Caja calc = new Caja(ancho, alto, profundidad);
        
        System.out.println("");
        System.out.println("Volumen = " + calc.calcular());
    }
}
