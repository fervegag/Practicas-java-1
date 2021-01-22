
public class Persona {

    private int idPersona;//SE asocia con los objetos (instacia)
    private String nombre;
    private static int contadorPersonas;//se asocia con la clase y no con los objetos

    public Persona(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

//    public void setIdPersona(int idPersona){
//        this.idPersona = idPersona;
//    }
    //Para este caso particular no se necesita el metodo set ya que el constructor es el que está inicializando la variable idPersona
    //La plantilla debe de estar lista para futuras modificaciones.
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "IdPersona: " + idPersona + ", Nombre: " + nombre + ", Contador personas: " + contadorPersonas;
    }
}
