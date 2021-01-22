
public class Condiciones {

    public static void main(String[] args) {
        var condicion = true;

        if (condicion) {
            System.out.println("La condición es verdadera");
        } else {
            System.out.println("La condición es falsa");
        }

        var numero = 0;

        if (numero == 1) {
            System.out.println("Número 1");
        } else if (numero == 2) {
            System.out.println("Número 2");
        } else if (numero == 3) {
            System.out.println("Número 3");
        } else {
            System.out.println("Valor desconocido");
        }
    }
}
