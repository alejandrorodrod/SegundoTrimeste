import java.util.Scanner;

public class Ejercicio2 {
    public static void entre(int menor, int mayor) {
        //Se imprimen los números que hay entre ellos
        for (int i = menor + 1; i < mayor; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //Se usa Math.min para ver cuál es el menor
        entre(Math.min(num1, num2), Math.max(num1, num2));
    }
}
