
public class EjemploEstatico {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Karla");
        System.out.println("persona2 = " + persona2);
        
        //Podemos comprobar el funcionamiento del atributo estatico,
        //Si le quitamos a contadorPersonas el modificador de acceso static,
        //no se guardará el valor de la variable y como resultado al crear un segundo objeto,
        //este tendrá el valor de 1 en ambos casos
        
        Persona persona3 = new Persona("Meri");
        System.out.println("persona3 = " + persona3);
        
        //LLamar el valor de la variables estatica contadorPersonas
        System.out.println("contadorPersonas "+Persona.getContadorPersonas());
    }
}
