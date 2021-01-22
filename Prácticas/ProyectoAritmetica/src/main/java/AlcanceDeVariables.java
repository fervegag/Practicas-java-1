
public class AlcanceDeVariables {

    public static void main(String[] args) {
        //variables locales; estamos dentro de un método
        int operandoA = 6;
        int operandoB = 2;
        //unicamnete accesibles dentro de este método

        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimos el resultado de la suma
        System.out.println("\nResultado de la suma: " + objeto1.sumar());
        System.out.println("\nResultado de la resta: " + objeto1.restar());
        System.out.println("\nRsultado de la Multiplicación: " + objeto1.multiplicar());
        System.out.println("\nResultado de la División: " + objeto1.dividir());
    }
}
