import java.util.Scanner;

public class Ejercicio38 {
    public static Double suma(double a, double b) {
        return a + b;
    }

    public static Double resta(double a, double b) {
        return a - b;
    }

    public static Double multiplicacion(double a, double b) {
        return a * b;
    }

    public static Double division(double a, double b) {
        //Se declara la variable a usar, el Double, con la primera en mayúsculas puede almacenar un valor null y un valor no válido
        Double resultado;

        if (b != 0) {
            resultado = a / b;
        } else {
            resultado = null;
        }

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

        switch (opcion) {
            case 1 -> {
                System.out.println("El resultado es: " + suma(num1, num2));
            }
            case 2 -> {
                System.out.println("El resultado es: " + resta(num1, num2));
            }
            case 3 -> {
                System.out.printf("El resultado es: %.2f", multiplicacion(num1, num2));
            }
            case 4 -> {
                System.out.printf("El resultado es: %.2f", division(num1, num2));
            }
        }
    }
}
