import java.util.Scanner;

public class Ejercicio11 {
    public static int mcd(int a, int b) {
        int res;
        if (b == 0) {
            res = a;
        } else if (a == 0) {
            res = b;
        } else if (a >= b) {
            res = mcd(a - b, b);
        } else {
            res = mcd(a, b - a);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Escriba el primer número");
        num1 = sc.nextInt();
        System.out.println("Escriba el segundo número");
        num2 = sc.nextInt();

        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd(num1, num2));
    }
}
