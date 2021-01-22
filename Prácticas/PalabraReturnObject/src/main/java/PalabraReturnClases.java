
public class PalabraReturnClases {

    public static void main(String[] args) {
        Suma s = creaObjetoSuma(); //Manda a llamar el objeto que se esta creando en el métodocreaObjetoSuma
        //Ahora s tiene la referencia del objeto
        System.out.println("Resultado de llamar el metodo sumar: " + s.sumar());

    }

    private static Suma creaObjetoSuma() {
        Suma suma = new Suma(4, 6);
        return suma; //Regresa la referencia del objeto
        //O también
        //Return new Suma(4, 6)
    }

}

//Se pueden crear clases en el mismo archivo
//Solo una clase dentro de este archivo puede ser publica
class Suma {

    int a;
    int b;

    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumar() {
        return this.a + this.b;
    }
}
