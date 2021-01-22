
import java.util.Scanner;

public class EjercicioOperadoresRectangulo {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        var alto = 1.0;
        var ancho = 1.0;
        var area = 1.0;
        var perimetro = 1.0;
        System.out.println("Proporciona el alto:");
        alto = Double.parseDouble(lectura.nextLine());
        System.out.println("Porporciona el ancho:");
        ancho = Double.parseDouble(lectura.nextLine());
        area = alto * ancho;
        perimetro = (alto + ancho) * 2;
        System.out.println("***Resultados***");
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);

    }
}
