package arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {

        //Declarar la variable de tipo arreglo
        int edades[];

        //Instanciar el arreglo de tipo int
        edades = new int[3];

        //Inicializar los elementos del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        System.out.println("edades[0] = " + edades[0]);
        System.out.println("edades[1] = " + edades[1]);
        System.out.println("edades[2] = " + edades[2]);

        //Otra forma más corta
        int precio[] = new int[4];
        precio[0] = 23;
        precio[1] = 44;
        System.out.println("precio [0] = " + precio[0]);
        System.out.println("precio [1] = " + precio[1]);
        System.out.println("precio [2] = " + precio[2]);

        //Declarar un arreglo de tipo object
        Persona personas[] = new Persona[4];
        //Inicializar los valores del arreglo
        personas[0] = new Persona("Fernando");
        personas[1] = new Persona("Vianey");

        System.out.println("personas [0] = " + personas[0]);
        System.out.println("personas [1] = " + personas[1]);
        System.out.println("personas [2] = " + personas[2]);

        //Arreglo utilizando la notación simplificada
        String nombres[] = {"Vianey", "Andrea", "Oreth"};
        System.out.println("");
        //Rcorrer los elementos
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre [" + i + "] = " + nombres[i]);
        }
    }
}
