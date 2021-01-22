
public class Ciclos {

    public static void main(String[] args) {
        var contador = 0;
//        while (contador < 3) {
//            System.out.println(contador);
//            contador++;
//        }
//        do {
//            System.out.println(contador);
//            contador++;
//        } while (contador < 3);

//        for (var i = 0; i < 3; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            break; //Rompe el ciclo
//        }
        inicio://Etiquetas o labels
        for (var i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                continue inicio; //Continua con la siguiente iteración del ciclo for
                //break inicio; //Rompe con el ciclo que está marcando la etiqueta
                //El uso de etiquetas no es recomendable en Java
            }
            System.out.println("i = " + i);
        }
    }

}
