import java.util.Scanner;

public class Ejercicio26 {
    public static double media(int a, int b) throws ArithmeticException {
        double resultado;
        resultado = (a + b) / 2.0;
        return resultado;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int nota1, nota2 = 0;

        //Se pide que introduzca las notas
        System.out.print("Ingrese la primera nota: ");
        nota1 = in.nextInt();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = in.nextInt();

        System.out.printf("El resultado es: %.2f", media(nota1, nota2));
    }
}
