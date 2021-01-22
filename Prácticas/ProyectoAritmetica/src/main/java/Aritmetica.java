
public class Aritmetica {

    //atributos de la clase
    int a;
    int b;

    //constructor vacio
    //ningun constuctor regresa un valor
    public Aritmetica() {
        System.out.println("Ejecutando constructor vacio");
    }
    
    //Constructor no vacio
    public Aritmetica(int a, int b) {
        //inicializar los valores de los argumentos de la clase
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constrcutor con dos argumentos");
    }
    //Cuando agregamos un costrcutor NO vacio es obligatorio agregar un constrcutor vacio
    //Esto por que ya no lo agrega automaticamente

    public int sumar() {//si borramos los argumentos las variables a continuación hacen referencia a los atributos de la clase
//        a =4;
//        b=6;
        int resultado = this.a + this.b;

        return resultado;
    }

    public int restar() {
        return this.a - this.b;
    }

    public int multiplicar() {
        return this.a * this.b;
    }

    public int dividir() {
        return this.a / this.b;
    }
}
