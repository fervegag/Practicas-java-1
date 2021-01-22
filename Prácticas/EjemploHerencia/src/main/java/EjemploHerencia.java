import java.util.Date;
public class EjemploHerencia {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Pinos 25");
        System.out.println("empleado1 = " + empleado1);
        
        Empleado empleado2 = new Empleado("Fernando", 15000);
        empleado2.setEdad(22);
        empleado2.setGenero('M');
        empleado2.setDireccion("Nogal 6");
        System.out.println("empleado2 = " + empleado2);
        
        Empleado empleado3 = new Empleado("Eduardo", 3000, 'M', 20, "Valle de Chalco");
        System.out.println("empleado3 = " + empleado3);
        
        System.out.println("");
        
        Cliente cliente1 = new Cliente(new Date(), true);
        cliente1.setNombre("Meri");
        cliente1.setGenero('F');
        cliente1.setEdad(20);
        cliente1.setDireccion("Sinaloa");
        System.out.println("cliente1 = " + cliente1);
        
        Cliente cliente2 = new Cliente("Oreth", 'F', 22, "Estado de México", new Date(), false);
        System.out.println("cliente2 = " + cliente2);

    }

}
