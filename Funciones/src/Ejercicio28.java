import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio28 {
    public static String[] calificaciones(int[] a) {
        String[] respuesta = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 5) {
                respuesta[i] = "Insuficiente";
            } else if (a[i] < 6) {
                respuesta[i] = "Suficiente";
            } else if (a[i] < 7) {
                respuesta[i] = "Bien";
            } else if (a[i] < 9) {
                respuesta[i] = "Notable";
            } else {
                respuesta[i] = "Sobresaliente";
            }
        }
        return respuesta;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int[] notas = new int[5];
        Scanner in = new Scanner(System.in);

        //Se pide que ingrese los números
        System.out.println("Ingrese las notas:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(calificaciones(notas)));
    }
}
