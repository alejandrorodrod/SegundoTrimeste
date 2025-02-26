import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {
    public static int[] busca(int[] t, int clave) {
        int[] resultado = new int[0];
        int[] aux;

        //Se comprueban todas las posiciones y se aumenta el tamaño del array donde se guardan según haya una más
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                aux = new int[resultado.length + 1];

                for (int j = 0; j < resultado.length; j++) {
                    aux[j] = resultado[j];
                }

                aux[aux.length - 1] = i;
                resultado = aux;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int[] num = new int[20];
        Random rand = new Random();
        int buscar;

        //Se pide que ingrese el número a buscar
        System.out.println("Ingrese el numero que desea buscar (del 1 al 10): ");
        buscar = in.nextInt();

        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(10);
        }

        System.out.println(Arrays.toString(busca(num, buscar)));
    }
}
