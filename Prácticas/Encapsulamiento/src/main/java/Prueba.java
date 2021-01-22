
public class Prueba {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 5000, false);
        
        //Recuperando los datos que enviamos en la creación del objeto
//        System.out.println("Nombre persona: " + persona.getNombre());
//        System.out.println("Sueldo persona: " + persona.getSueldo());
//        System.out.println("Persona borrada: " + persona.isEliminado());
        
        //Mostrando la información con el metodo toString
        System.out.println("Persona: "+persona.toString());

        System.out.println("\nHaciendo modificaciones\n");
        //Modificando la información
        persona.setNombre("Fernando");
        persona.setSueldo(3000);
        persona.setEliminado(true); 
        //Recuperando los datos
//        System.out.println("Nombre persona: " + persona.getNombre());
//        System.out.println("Sueldo persona: " + persona.getSueldo());
//        System.out.println("Persona borrada: " + persona.isEliminado());
        
        //De manera automática, el método println llama al método toString
        System.out.println("Persona: "+persona);
    }
}
