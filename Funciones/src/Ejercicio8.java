import java.util.Scanner;

public class Ejercicio8 {
    public static Double resultado(int op, double a, double b) {
        //Se declara la variable a usar, el Double, con la primera en mayúsculas puede almacenar un valor null y un valor no válido
        Double resultado = switch (op) {
            case 1 -> {
                yield a + b;
            }
            case 2 -> {
                yield a - b;
            }
            case 3 -> {
                yield a * b;
            }
            case 4 -> {
                if (b != 0) {
                    yield a / b;
                } else {
                    yield null;
                }
            }
            default -> {
                yield null;
            }
        };
        return resultado;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2;

        //Se pide que ingrese una opción
        System.out.println("¿Qué quiere calcular? (1 suma, 2 resta, 3 multiplicación y 4 división)");
        opcion = sc.nextInt();

        //Se piden ambos números
        System.out.println("Introduzca el primer número:");
        num1 = sc.nextDouble();

        System.out.println("Introduzca el segundo número:");
        num2 = sc.nextDouble();

        System.out.printf("El resultado es: %.2f", resultado(opcion, num1, num2));
    }
}
