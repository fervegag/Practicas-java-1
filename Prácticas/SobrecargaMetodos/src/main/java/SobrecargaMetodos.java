
public class SobrecargaMetodos {

    public static void main(String[] args) {

        System.out.println("REsultado 1 = " + Operaciones.sumar(3, 4));
        System.out.println("Resultado 2 = " + Operaciones.sumar(2.0, 5.3));
        System.out.println("Resultado 3 = " + Operaciones.sumar(5, 3.2));
        System.out.println("Resultado 4 = " + Operaciones.sumar(5.6, 3));
        
        System.out.println("Resultado 5 = "+Operaciones.sumar(3F, 'A'));
    }
}
