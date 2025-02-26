import java.util.Scanner;

public class Ejercicio33 {
    public static void triangulo(char a, int b) {
        //Se imprimen el número de líneas pedidas
        for (int i = 0; i < b; i++) {
            //Se imprimen los espacios, esto es el número de líneas hasta i + 1
            for (int j = b; j > i + 1; j--) {
                System.out.print(" ");
            }
            //Se imprime el carácter tantas veces como hce falta
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner teclado = new Scanner(System.in);
        char caracter;
        int lineas;

        System.out.println("Ingrese el carácter que desea imprimir");
        caracter = teclado.next().charAt(0);
        System.out.println("Ingrese el numero de lineas");
        lineas = teclado.nextInt();

        triangulo(caracter, lineas);
    }
}
