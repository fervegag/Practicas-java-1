
public class PalabraReturnTiposPrimitivos {

    public static void main(String[] args) {

        sumarSinRetornarValor(3, 6);
        int sumaRetorno = sumarRetornandoValor(2, 22);
        System.out.println("sumaRetorno = " + sumaRetorno);
    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("Sumar sin retornar valor: " + (a + b));
        return; //Opcional cuando el tipo es void
    }

    private static int sumarRetornandoValor(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Debe proporcionar valores distintos de cero");
            return 0;
        }
        return a + b;
    }

}
