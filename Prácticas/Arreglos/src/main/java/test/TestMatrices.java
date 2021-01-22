package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2]; //3 renglones x 2 columnas

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 6;
        edades[2][1] = 9;

//        System.out.println("edades 0-0 = " + edades[0][0]);
//        System.out.println("edades 0-1 = " + edades[0][1]);
//        System.out.println("edades 1-0 = " + edades[1][0]);
//        System.out.println("edades 1-1 = " + edades[1][1]);
//        System.out.println("edades 2-0 = " + edades[2][0]);
//        System.out.println("edades 2-1 = " + edades[2][1]);

        /*Ciclo for anidado*/
        for (int renglon = 0; renglon < edades.length; renglon++) {

            for (int columna = 0; columna < edades[renglon].length; columna++) {
                System.out.println("edades " + renglon + "-" + columna + ": " + edades[renglon][columna]);
            }
        }

        System.out.println("\n");

        /*Utilizando la sintaxis simplificada*/
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};

//        for (int ren = 0; ren < frutas.length; ren++) {
//
//            for (int col = 0; col < frutas[ren].length; col++) {
//                System.out.println("frutas " + ren + "-" + col + ": " + frutas[ren][col]);
//
//            }
//
//        }
        imprimir(frutas);
        System.out.println("\n");

        /*Matriz de objetos de tipo persona*/
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Eduardo");
        personas[1][0] = new Persona("Fernando");
        personas[1][1] = new Persona("Vianey");
        personas[1][2] = new Persona("Nash");
        /*Llamando al metodo imprimir*/
        imprimir(personas);
        
    }

    /*Creando metodo para imprimir los elementos del arreglo*/
 /*No se necesita especificar el tamaño, ya que apuntará directamente a la referencia del objeto matriz que se haya creado*/
    public static void imprimir(Object matriz[][]) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }

        }
    }
}
