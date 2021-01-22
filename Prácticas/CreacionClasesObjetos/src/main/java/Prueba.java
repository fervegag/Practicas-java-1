
public class Prueba {

    public static void main(String[] args) {
        Persona p1 = new Persona();

        p1.name = "Fernando";
        p1.lastname = "Vega";

        p1.showName();

        Persona p2 = new Persona();
        
        System.out.println("");

        p2.name = "Vianey";
        p2.lastname = "Bracamontes";
        
        p2.showName();
    }
}
