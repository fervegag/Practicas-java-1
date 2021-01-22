
public class PrecedenciaDeOperadores {

    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;//X=6 + y=10....... Valor de z = 16
        //valor hasta este momento de x = 6 ... y =19
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("\n***Ejemplo 2***\n");
        var resultado = 4 + 6 * 6 / 3;
        //4 + 36 / 3
        //4 + 12
        // redultado = 16
        System.out.println("resultado = " + resultado);
        
        resultado = (4 + 6) * 6 / 3;
        //10 * 6 / 3
        //60 / 3
        //Resultado = 20
        System.out.println("resultado = " + resultado);
        

    }

}
