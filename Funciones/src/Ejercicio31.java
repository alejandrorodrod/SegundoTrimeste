import java.util.Scanner;

public class Ejercicio31 {
    public static boolean perfecto(int n) {
        boolean result = false;
        int suma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        if (n == suma) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int perf;

        System.out.println("Introduce el número");
        perf = in.nextInt();

        System.out.println("El número es perfecto: " + perfecto(perf));
    }
}
