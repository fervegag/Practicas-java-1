
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, int sueldo) {
        //Llamar al constructor
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    //Constructor con todos los argumentos
    public Empleado(String nombre, int sueldo, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    //Para este caso no utiliaramos en metodo setEmpleado ya que se está inicializando en el constructor
//    public void setIdEmpleado(int idEmpleado) {
//        this.idEmpleado = idEmpleado;
//    }
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }
    //Para este caso no necesitamos el método setcontadorEmpleado ya que se está autoincrementando en el constructor
//    public static void setContadorEmpleado(int contadorEmpleado){
//        Empleado.contadorEmpleado=contadorEmpleado;
//    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    }

}
