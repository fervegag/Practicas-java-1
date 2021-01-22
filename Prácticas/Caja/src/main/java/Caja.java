
public class Caja {

    //atrbutos de la clase
    int w;
    int h;
    int d;

    //Constructor vacío
    public Caja() {

    }

    //Constructor con tres argumentos
    public Caja(int ancho, int alto, int profundidad) {
        this.w = ancho;
        this.h = alto;
        this.d = profundidad;
    }

    //Método para hacer los calculos
    public int calcular() {
        return this.w * this.h * this.d;
    }
}
