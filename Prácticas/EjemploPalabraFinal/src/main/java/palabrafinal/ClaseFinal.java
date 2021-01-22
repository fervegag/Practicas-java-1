package palabrafinal;

//significa que ya no podremos crear clases hijas de esta clase
public final class ClaseFinal {

    //Variables marcadas como final
    //Deben ser inicializadas ya que no se podrá modificar después, se asemeja a una constante
    public final int varNumero = 10;

    //constantes en java
    //Las constantes en java se acostumbran escribir con mayusculas
    public static final int VAR_PRIMITIVO = 15;
    
    //asignamos la referencia del objeto persona a la constante VAR_PERSONA
    public static final Persona  VAR_PERSONA = new Persona();
    
    //Agrgar final a un metodo. se verá más a detalle en sobre escritura de metodos 
    public final void metodoFinal(){}
    //En caso de que la calse padre lo permita, cuando creemos una clase hija,
    //Esta no podrá modificarl el comportamiento del método (sobre escritura)
    
    
}
