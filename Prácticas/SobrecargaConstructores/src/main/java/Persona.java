
public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    //Constrcutro vacio de tipo privado
    private Persona() {
        this.idPersona = ++contadorPersonas;
    }

    //Sobrecarga de constrcutores = Constructor completo
    public Persona(String nombre, int edad) {
        //Llamando al constructor sin argumentos
        //También se puede llamar a algun constrcutor con uno o más argumentos
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

//    public void setIdPersona(int idPersona) {
//        this.idPersona = idPersona;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

//    public static void setContadorPersonas(int contadorPersonas) {
//        Persona.contadorPersonas = contadorPersonas;
//    }
    

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
