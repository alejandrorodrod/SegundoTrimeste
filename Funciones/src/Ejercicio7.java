import java.util.Scanner;

public class Ejercicio7 {
    public static boolean esPrimo(int n) {
        //Se comprueba si el número es primo
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

    public static int divisores(int n) {
        //Se comprueban los divisores del número introducido y se cuentan
        int cont = 0;

        for (int i = 2; i <= n; i++) {
            //Se comprueba si es primo o no
            if (n % i == 0 && esPrimo(i)) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int num;
        Scanner s = new Scanner(System.in);

        //Se pide el número
        System.out.println("Ingrese un número:");
        num = s.nextInt();

        //Se imprimen los divisores
        System.out.println("Los divisores son:" + divisores(num));
    }
}
