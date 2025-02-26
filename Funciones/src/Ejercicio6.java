import java.util.Scanner;

public class Ejercicio6 {
    public static boolean esPrimo(int n) {
        //Se comprueba si el número es mayor que 2 y si es primo
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int num;
        Scanner s = new Scanner(System.in);

        //Se pide que ingrese el número
        System.out.println("Ingrese el numero");
        num = s.nextInt();

        //Se devuelve el resultado
        System.out.println("El número introducido es primo: " + esPrimo(num));
    }
}
