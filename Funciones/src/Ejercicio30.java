import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio30 {
    public static double[] fibonacci(int n) {
        double[] array = new double[n];

        //Se da el valor a las dos primeras posiciones
        if (n > 2) {
            array[0] = 0;
            array[1] = 1;
        } else if (n > 1) {
            array[0] = 0;
        }

        //Se hace un bucle for en el que se añade al array los números de fibonacci hasta estar lleno
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int num;

        //Se pide un número
        System.out.println("Introduce un número");
        num = in.nextInt();

        System.out.printf(Arrays.toString(fibonacci(num)));
    }
}
