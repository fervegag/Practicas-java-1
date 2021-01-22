
import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {

        //Enteros: byte, short, int, long
        System.out.println("Tipos primitivos Enteros:\n");
        byte varByte = 127;
        System.out.println("varByte = " + varByte);

        System.out.println("Bits del tipo byte = " + Byte.SIZE);
        System.out.println("Bytes del tipo byte = " + Byte.BYTES);
        System.out.println("Valor minumos del tipo byte = " + Byte.MIN_VALUE);
        System.out.println("Valor mmaximo del tipo byte = " + Byte.MAX_VALUE);

        System.out.println("*************************************");
        short varShort = 200;
        System.out.println("varShort = " + varShort);

        System.out.println("Bits del tipo short = " + Short.SIZE);
        System.out.println("Bytes del tipo short = " + Short.BYTES);
        System.out.println("Valor minumos del tipo short = " + Short.MIN_VALUE);
        System.out.println("Valor mmaximo del tipo short = " + Short.MAX_VALUE);

        System.out.println("**************************************");
        int varInt = 5000;
        System.out.println("varInt = " + varInt);
        System.out.println("Bits del tipo int = " + Integer.SIZE);
        System.out.println("Bytes del tipo int = " + Integer.BYTES);
        System.out.println("Valor minumos del tipo int = " + Integer.MIN_VALUE);
        System.out.println("Valor mmaximo del tipo int = " + Integer.MAX_VALUE);

        System.out.println("**************************************");
        long varLong = 9223;
        System.out.println("varLong = " + varLong);
        System.out.println("Bits del tipo long = " + Long.SIZE);
        System.out.println("Bytes del tipo long = " + Long.BYTES);
        System.out.println("Valor minumos del tipo long = " + Long.MIN_VALUE);
        System.out.println("Valor mmaximo del tipo long = " + Long.MAX_VALUE);

        System.out.println("**************************************");
        var numero = 9223372036854775807L; //con la L establecemos que es de tipo long
        System.out.println("numero = " + numero);

        //Flotantes
        System.out.println("\nTipos primitivos Flotantes:\n");
        float varFloat = 1000.10F;
        System.out.println("varFloat = " + varFloat);
        System.out.println("Bits del tipo float = " + Float.SIZE);
        System.out.println("Bytes del tipo float = " + Float.BYTES);
        System.out.println("Valor minumos del tipo float = " + Float.MIN_VALUE);
        System.out.println("Valor mmaximo del tipo float = " + Float.MAX_VALUE);

        System.out.println("**************************************");
        double varDouble = 1000.765D; //Para ser más específicos
        System.out.println("varDouble = " + varDouble);
        System.out.println("Bits del tipo double = " + Double.SIZE);
        System.out.println("Bytes del tipo double = " + Double.BYTES);
        System.out.println("Valor minumos del tipo double = " + Double.MIN_VALUE);
        System.out.println("Valor mmaximo del tipo double = " + Double.MAX_VALUE);

        //Char
        System.out.println("\nTipo primitivo Char:\n");

        System.out.println("Bits del tipo char = " + Character.SIZE);
        System.out.println("Bytes del tipo char = " + Character.BYTES);
        System.out.println("Valor minumos del tipo char = " + Character.MIN_VALUE);
        System.out.println("Valor mmaximo del tipo char = " + Character.MAX_VALUE);

        char varChar = 'a'; //unicamente soporta un caracter, usa comillas simples
        System.out.println("varChar = " + varChar);

        var varCharUnicode = '\u0021';
        System.out.println("varCharUnicode = " + varCharUnicode);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        var varCharGlyph = '!';
        System.out.println("varCharGlyph = " + varCharGlyph);

        //Boolean
        System.out.println("\nTipo primitivo boolean\n");
        System.out.println("True tipo boolean: " + Boolean.TRUE);
        System.out.println("False tipo boolean: " + Boolean.FALSE);

        boolean varBoolean = false;

        if (varBoolean) { //Por si solo significa que si es verdadero
            System.out.println("El valor es verdadero");
        } else {
            System.out.println("El valor es falso");
        }

        var edad = 20;
        var esAdulto = edad >= 18; //Regresa un valor de True o False
        System.out.println("esAdulto = " + esAdulto);

        //Conversión de tipos primitivos
        System.out.println("**************************************");
        System.out.println("\nConversión de tipos primitivos\n");

        //convertir un String a un tipo Int
        var _edad = Integer.parseInt("20");
        System.out.println("_edad = " + _edad);

        double valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        char c = "Hola".charAt(0); //obtener un solo caracter de acuerdo a su posición
        System.out.println("c = " + c);

        //Ejercicio con Scanner
        System.out.println("\n*****************************\n");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su edad:");
        int $edad = Integer.parseInt(lectura.nextLine());
        System.out.println("$edad = " + $edad);

        //Regresar un solo caracter
        /*System.out.println("Ingrese una cadena de texto");
        char varCadena = lectura.nextLine().charAt(0);
        System.out.println("varCadena = " + varCadena);*/
        //convertir un entero a un String
        String edadTexto = String.valueOf($edad); //puede convertir cualquier tipo primitivo a string
        System.out.println("edadTexto = " + edadTexto);

        //Conversión entre tipos o casting
        System.out.println("\nConversión entre tipos\n");
        short s = 10; //Puebe haber perdida de información
        byte b = (byte) s;
        System.out.println("b = " + b);
    }
}
