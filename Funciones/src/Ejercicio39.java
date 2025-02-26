import java.util.Random;
import java.util.Scanner;

public class Ejercicio39 {
    public static int apuestamaquina(int a) {
        int resultado;
        Random r = new Random();

        resultado = r.nextInt(1, a + 1);
        return resultado;
    }

    public static int ganador(int a, int b, int c) {
        int resultado, ganador = 0;
        Random r = new Random();

        resultado = r.nextInt(1, a + 1);

        if (b) {
            ganador = 1;
        } else if (resultado == c) {
            ganador = 2;
        }
        return ganador;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int caras, apuestajug, apuestama;

        //Se pide al usuario que diga las caras del dado
        System.out.print("Introduce el numero de caras: ");
        caras = in.nextInt();

        System.out.print("Introduce el numero de apuesta: ");
        apuestajug = in.nextInt();

        apuestama = apuestamaquina(caras);
        switch (ganador(caras, apuestajug, apuestama)) {
            case 1 -> {
                System.out.println("El ganador es el jugador");
            }
            case 2 -> {
                System.out.println("El ganador es el maquina");
            }
            default -> {
                System.out.println("Nadie ha ganado");
            }
        }
    }
}
