import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio27 {
    public static int[] ordenMayor(int a, int b, int c) {
        int[] array = new int[3];

        //Se comprueba con un if y la clase Math cuál es el mayor y cuál el menor
        if (Math.max(a, Math.max(b, c)) == a) {
            array[0] = a;
            array[1] = Math.max(b, c);
            array[2] = Math.min(b, c);
        } else if (Math.max(a, Math.max(b, c)) == b) {
            array[0] = b;
            array[1] = Math.max(a, c);
            array[2] = Math.min(a, c);
        } else {
            array[0] = c;
            array[1] = Math.max(a, b);
            array[2] = Math.min(a, b);
        }
        return array;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Ingrese el primer número: ");
        num1 = in.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = in.nextInt();
        System.out.print("Ingrese el tercer número: ");
        num3 = in.nextInt();

        System.out.println(Arrays.toString(ordenMayor(num1, num2, num3)));
    }
}
