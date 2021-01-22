
public class Empleado extends Persona {

    private double sueldo;

    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }

    //Constrcutor sobrecargado
    public Empleado(String nombre, int edad, double sueldo) {
        //Aquí se puede mandar a llamar el constructor de la clase padre con palabra super
        //Pero usaremos el constrcutor con dos argumentos de la clase Empelado para poner en práctica la palabra this
        this(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    

}
