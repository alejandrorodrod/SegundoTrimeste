import java.util.Scanner;

public class Ejercicio12 {
    public static int fibonacci(int n) {
        //Si el valor introducido es la posición es 0, si es dos la posición es 1
        int res;
        if (n == 1) {
            res = 0;
        } else if (n == 2) {
            res = 1;
        } else {
            res = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el numero de la serie de Fibonacci que quieres saber");
        numero = sc.nextInt();

        System.out.println("El numero es " + fibonacci(numero));
    }
}