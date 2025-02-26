import java.util.Scanner;

public class Ejercicio18 {
    public static boolean amigos(int a, int b) {
        boolean resultado = false;
        //Se mira si son números amigos
        int div = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                div += i;
            }
        }
        if (div == b) {
            div = 0;
            for (int i = 1; i < b; i++) {
                if (b % i == 0) {
                    div += i;
                }
            }
            if (div == a) {
                resultado = true;
            }
        } else {
            resultado = false;
        }
        return resultado;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        //Se pide que introduzcan los números
        System.out.println("Introduce un numero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = sc.nextInt();

        System.out.println(amigos(num1, num2));
    }
}
