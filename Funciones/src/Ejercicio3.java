import java.util.Scanner;

public class Ejercicio3 {
    public static void reultado(int op, double r, double h) {
        //Si elige la op 1 calcula el área, si es la 2 el volumen y si no es ninguna la opción no es válida
        if (op == 1) {
            System.out.printf("El área es: %.2f", (Math.PI * 2) * r * (r + h));
        } else if (op == 2) {
            System.out.printf("El volumen es: %.2f", Math.PI * (r * r) + h);
        } else {
            System.out.println("Opción no valida");
        }
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        int opcion;
        double radio, altura;

        //Se pide el rádio y la altura
        System.out.println("Introduzca el rádio:");
        radio = sc.nextDouble();

        System.out.println("Introduzca la altura:");
        altura = sc.nextDouble();

        //Se pide que ingrese una opción
        System.out.println("¿Quiere calcular el área o el volumen de un cilindro? (1 área 2 volumen)");
        opcion = sc.nextInt();
        reultado(opcion, radio, altura);
    }
}
