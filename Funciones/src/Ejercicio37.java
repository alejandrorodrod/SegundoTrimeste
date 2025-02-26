import java.util.Scanner;

public class Ejercicio37 {
    public static void numcaract(String a) {
        //Se pasa el número de caracteres de la cadena de texto
        int num = a.length();
        System.out.println("El número de caracteres es: " + num);
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        String nombre;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        nombre = teclado.nextLine();
        numcaract(nombre);
    }
}
