import java.util.Random;
import java.util.Scanner;

public class Ejercicio20 {
    public static int comprobacion(int[] a, int[] b) {
        int cont = 0;
        //Se comparan ambos arrays
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    cont++;
                    break;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int[] numprim = new int[6];
        int[] numganador = new int[6];
        Random rand = new Random();
        boolean cambio;
        int tam = numprim.length, men;

        //Se pide al usuario que introduzca los números de la primitiva
        System.out.println("Introduzca los números que quiere jugar");

        for (int i = 0; i < numprim.length; i++) {
            numprim[i] = in.nextInt();
            if (numprim[i] > 50) {
                i--;
            }
        }

        //Se ponen los números ganadores ordenados y luego se ordenan
        for (int i = 0; i < numganador.length; i++) {
            numganador[i] = rand.nextInt(1, 50);
            for (int j = 0; j < i; j++) {
                if (numganador[i] == numganador[j]) {
                    i--;
                }
            }
        }
        do {
            cambio = false;
            for (int i = 0; i < tam - 1; i++) {
                //Se hace un if para cambiar el valor con el de al lado si es mayor
                if (numganador[i] > numganador[i + 1]) {
                    men = numganador[i + 1];
                    numganador[i + 1] = numganador[i];
                    numganador[i] = men;
                    cambio = true;
                }
            }

            //Como la última posición ya está ordenada reduzco el número de la posición final para no comprobarla
            tam--;
        } while (cambio == true);

        System.out.println(comprobacion(numprim, numganador));
    }
}
