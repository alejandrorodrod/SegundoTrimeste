import java.util.Scanner;

public class Ejercicio36 {
    public static int numcaract(String a) {
        //Se pasa el número de caracteres de la cadena de texto
        int num = a.length();

        return num;
    }

    public static char caracter(String a) {
        //Se devuelve el último carácter
        try {
            return a.charAt(a.length());
        } catch (StringIndexOutOfBoundsException e) {

        }
        return '\0';
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        String nombre;
        Scanner teclado = new Scanner(System.in);
        int cont = 0;

        do {
            System.out.print("Introduce una cadena de texto (0000 cierra el programa): ");
            nombre = teclado.nextLine();

            if (!nombre.equals("0000")) {
                System.out.println("El número de caracteres es: " + numcaract(nombre) + " y el último carácter es: " + caracter(nombre));
            } else if (nombre.isEmpty()) {
                cont++;
            }

        } while (!nombre.equals("0000"));

        System.out.println("El número de veces que los caracteres han sido 0 es: " + cont);
    }
}
