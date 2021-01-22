package palabrafinal;

public class EjemploPalabraFinal {

    public static void main(String[] args) {

        //intentando modificar un atributo final
        //ClaseFinal.VAR_PRIMITIVO = 20;
        //No lo permite
        //Intentar modificar la referencia de un atributo de tipo object
        //ClaseFinal.VAR_PERSONA = new Persona ();
        //No lo permite
        //Usando los metodos de la clase persona por medio me la contante VAR_PERSONA
        ClaseFinal.VAR_PERSONA.setNombre("Fernando");
        System.out.println(ClaseFinal.VAR_PERSONA);
        
        ClaseFinal.VAR_PERSONA.setNombre("Meri");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
