
public class Operadores {

    public static void main(String[] args) {

        int a = 3, b = 2;
        int resultado = a + b;

        System.out.println("resultado Suma = " + resultado);

        System.out.println("resultado = " + a + b);

        System.out.println("resultado = " + (a + b));

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        System.out.println("resultado = " + (a - b));

        resultado = a * b;
        System.out.println("resultado multiplicación= " + resultado);

        var resultado2 = 3F / b;
        System.out.println("resultado división= " + resultado2);

        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);

        resultado = a % 2;
        if (resultado == 0) {
            System.out.println("Es Par");
        } else {
            System.out.println("Es impar");
        }

        //Operaadores de asignación
        System.out.println("\n****Operadores de asignación****\n");
        int c = a;
        System.out.println("c = " + c);
        c = a + 5 - b;
        System.out.println("c = " + c);

        //Operadores de composición
        a += 1; //a=a+1
        System.out.println("a = " + a);

        a += 3; //a=a+3
        System.out.println("a = " + a);

        b -= 1;
        System.out.println("b = " + b);

        b *= 2;
        System.out.println("b = " + b);

        a /= 2;
        System.out.println("a = " + a);

        b %= 2;
        System.out.println("b = " + b);

        //Operadores unarios
        System.out.println("\n****Operadores Unarios****\n");
        int x = 3;
        int y = -x; //Operador de inversión
        System.out.println("y = " + y);

        boolean z = true;
        boolean w = !z;//Operador de inversión de un tipo boolean
        System.out.println("w = " + w);

        //Increment y decremento
        //Pre incremento
        System.out.println("Pre incremento");
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //Post incremento
        System.out.println("Post incremento");
        int g = 5;
        int h = g++;//El valor de la variable g se incrementa hasta la siguiente vez que la utilicemos
        //La variable h tomo el valor inicial de g.
        System.out.println("g = " + g);
        // para este momento ya es el segundo uso de la variable g, por eso ahora si se hace el incremento
        System.out.println("h = " + h);

        //Pre decremento
        System.out.println("pre decremento");
        int i = 2;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        System.out.println("Post decremento");
        int k = 4;
        int l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        //Operadores de igualdad
        System.out.println("\n***Operadores de igualdad***\n");
        a = 2;
        b = 3;
        boolean u = a == b;
        System.out.println("u = " + u);

        u = a != b;
        System.out.println("u = " + u);

        var cadena1 = "Hola";
        String cadena2 = "Adios";
        System.out.println("¿Las cadenas son iguales? = " + cadena1.equals(cadena2));

        //Operadores relacionales
        System.out.println("\n***Operadores relacionales***\n");
        boolean d = a < b;
        System.out.println("d = " + d);
        d = a > b;
        System.out.println("d = " + d);
        d = a >= b;
        System.out.println("d = " + d);
        d = a <= b;
        System.out.println("d = " + d);

        //Ejercicio
        if (b % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }
        //Ejercicio 2
        int edad = 31;
        int adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //Operadores condicionales
        //Recben dos agumentos de tipo boolean
        System.out.println("\n***Operadores condicionales***\n");

        a = 11;
        int valorMinimo = 0, valorMaximo = 10;
        //Operador and &&
        boolean result = a >= valorMinimo && a <= valorMaximo;
        System.out.println("result = " + result);
        //Operador or ||
        boolean vacaciones = false;
        boolean diaDescanso = true;
        if (vacaciones || diaDescanso) {
            System.out.println("El padre puede asistir al juego");
        } else {
            System.out.println("El padre esta ocupado");
        }

        //Operador Ternario
        System.out.println("\n***Operador ternario***\n");
        //(expresisón) ? true : false;
        var resultTernario = (3 > 5) ? "Verdadero" : false; //Puede regresar cualquier tipo de dato
        System.out.println("resultTernario = " + resultTernario);

        var num = 6;
        var par = (num % 2 == 0) ? "Numero par" : "Numero Impar";
        System.out.println("par = " + par);
    }

}
