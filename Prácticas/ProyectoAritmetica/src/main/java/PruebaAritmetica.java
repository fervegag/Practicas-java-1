
public class PruebaAritmetica {

    public static void main(String[] args) {
        //creamos un objeto de tipo artimetica
        int x = 5, y = 10;
        Aritmetica a = new Aritmetica();//de esta manera esta llamando al costrcutor vacio
//        //esto no es una buena practica
//        a.a = 40;
//        a.b = 50;
        //Forma 1: llamar directamente 
        System.out.println("Resultado = " + a.sumar());
        System.out.println("");
        //Forma 2: asignar el valor de retorno a una variable
        int resultado = a.sumar();
        System.out.println("resultado = " + resultado);

        //creacion de un segundo objeto
        System.out.println("");
        Aritmetica arit = new Aritmetica(4, 2);
        System.out.println("Resultado2 = " + arit.sumar());
    }

}
