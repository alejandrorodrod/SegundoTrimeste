import java.util.Scanner;

public class Ejercicio5 {
    public static boolean vocal(char c) {
        //Se comprueba si lo introducido es una vocal
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        char caracter;
        Scanner s = new Scanner(System.in);

        //Se pide que introduzca un carácter
        System.out.println("Ingrese un carácter:");
        caracter = s.next().charAt(0);

        //Se imprime el resultado
        System.out.println("El carácter introducido es vocal:" + vocal(caracter));
    }
}
