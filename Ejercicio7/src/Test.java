import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se declaran las variables a usar
        int edad;
        String nombre;
        Scanner sc = new Scanner(System.in);

        //Se crea el objeto
        Persona persona = new Persona();

        //Se pide que introduzca datos
        System.out.println("Ingrese su nombre y edad");
        persona.setNombre(sc.nextLine());
        persona.setEdad(sc.nextInt());

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
    }
}
