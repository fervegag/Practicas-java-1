
public class PalabraThis {

    public static void main(String[] args) {

        Persona persona = new Persona("Fernando");
    }
}

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;//this apunta a un objeto del tipo persona

        System.out.println("Impresión del operador this dentro de la clase persona: " + this);

        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);//con el objeto imprimir llamamos a la funsión imprimir y le mandamos la referencia del objeto Persona con la palabra this
    }
}

class Imprimir {

    public void imprimir(Persona p) {
        System.out.println("Impresión del argumento persona: " + p);//Valor del objeto persona
        System.out.println("impresión del objeto actual (this): " + this);//this apunta a un objeto de tipo imprimir
    }
}
