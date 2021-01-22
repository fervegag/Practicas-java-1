
import com.vega.Utileria;
import static com.vega.Utileria.Imprimir;

public class PruebaPaquetes {

    public static void main(String[] args) {
        //Fully Qualified name
        //com.vega.Utileria.Imprimir("Hola"); //Nombre Completamente Calificado, no es la forma más común

        //Haciendo un import de la clase
        Utileria.Imprimir("Hola");

        System.out.println("");
        //Haciendo un import static
        Imprimir("Static");
    }
}
