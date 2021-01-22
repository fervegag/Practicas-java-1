
public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //Constructor que recibe los 3 argumentos
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //Metodos getter y Setter
    //Obtener el valor del atributo
    //set Modificar el valor de los atributos
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Para los tipos boolean, en lugar de poner get se pone is
    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    //Metodo toString
    //regresa una cadena con cada uno de los valores de cada atributo de la clase

//    public String toString() {
//        return "Nombre: " + nombre + ", Sueldo: " + sueldo + ", Eliminado: " + eliminado;
//    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
    
}
