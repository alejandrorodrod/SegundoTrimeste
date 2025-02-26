import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        String opcion;

        //Se declaran los objetos a usar
        Scanner sc = new Scanner(System.in);
        Emisora emisora = new Emisora();

        emisora.mostrarFrecuencia();

        System.out.println("Indique si quiere subir o bajar la frecuencia");
        opcion = sc.nextLine().toLowerCase();

        if (opcion.equals("bajar")) {
            emisora.bajarFrecuencia();
        } else if (opcion.equals("subir")) {
            emisora.subirFrecuencia();
        } else {
            System.out.println("Opcion no valida");
        }

        emisora.mostrarFrecuencia();
    }
}
