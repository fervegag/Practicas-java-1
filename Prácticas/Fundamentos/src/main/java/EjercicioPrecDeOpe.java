
public class EjercicioPrecDeOpe {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
        System.out.println("res = " + res);
        //6 / ++a = 6 / 3 = 2 ...........Valor de a = 3
        System.out.println(6 / 3);
        // 2 * 4 = 8
        System.out.println(2 * 4);
        //-3 + 8 = 5
        System.out.println(-3 + 8);
        //5 - b-- = 5 - 3 = 2 .............Valor de b = 2
        System.out.println(5 - 3);
        //2 + 2 = 4
        System.out.println("Resultado a mano = 4 ");
        System.out.println("resultado real = " + res);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
