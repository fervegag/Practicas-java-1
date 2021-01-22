
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.cambiarNombre("Juan");
        System.out.println("Valor del nombre: "+persona.obtenerNombre());
        
        modificarPersona(persona);//Solo estamos pasando la referencia
        
        System.out.println("Valor del nombre modificado = " + persona.obtenerNombre());
    }

    private static void modificarPersona(Persona personaArg) {//Ahora la variable persona y personaArg estan apuntando al mismo objeto
        personaArg.cambiarNombre("Carlos");
        
    }
    
}
