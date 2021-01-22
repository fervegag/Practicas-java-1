
public class SobrecargaConstructores {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Fernando", 22);
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Meri", 20);
        System.out.println("persona2 = " + persona2);

        //Creando un empleado con el constrcutor que recibe las variables nombre y edad
        Empleado empleado1 = new Empleado("Eduardo", 22);
        System.out.println("empleado1 = " + empleado1);
        //Agregando el sueldo con el metodo setSueldo
        empleado1.setSueldo(5000);
        System.out.println("empleado1 = " + empleado1);

        //Creando un empleado con el constrcutor que recibe las variables de nombre, edad y sueldo
        Empleado empleado2 = new Empleado("Jesús", 30, 15000);
        System.out.println("empleado2 = " + empleado2);
        //Llamada de forma larga
        System.out.println("");
        System.out.println("idPersona= " + empleado2.getIdPersona() + " Nombre= " + empleado2.getNombre() + " Edad= " + empleado2.getEdad() + " Sueldo= " + empleado2.getSueldo());
    }

}
