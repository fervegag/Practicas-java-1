
import java.util.Scanner;

public class CondEstacionesSwitch {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Proporcionar el valor del mes: ");
        var mes = lectura.nextInt();
        String estacion = null;
        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
            default:
                estacion = "Mes incorrecto";
        }
        System.out.println("Estacion: " + estacion + " Para el mes: " + mes);
    }
}
