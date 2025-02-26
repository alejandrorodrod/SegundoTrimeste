import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
    public static int[] rellenapares(int longitud, int fin) {
        Random r = new Random();
        int num, tam = longitud, men;
        boolean cambio;
        //Se da el tamaño al array y los valores pares
        int[] array = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            num = r.nextInt(2, fin + 1);
            if (num % 2 == 0) {
                array[i] = num;
            } else {
                i--;
            }
        }
        do {
            cambio = false;
            for (int i = 0; i < tam - 1; i++) {
                //Se hace un if para cambiar el valor con el de al lado si es mayor
                if (array[i] > array[i + 1]) {
                    men = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = men;
                    cambio = true;
                }
            }

            //Como la última posición ya está ordenada reduzco el número de la posición final para no comprobarla
            tam--;
        } while (cambio == true);
        return array;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner teclado = new Scanner(System.in);
        int num, longi;
        int[] pares;

        //Se pide que introduzca la longitud del array
        System.out.print("Ingrese el numero de longitud: ");
        longi = teclado.nextInt();

        //Se pide que introduzca el límite
        System.out.print("Ingrese el numero máximo: ");
        num = teclado.nextInt();

        pares = rellenapares(longi, num);
        System.out.println(Arrays.toString(pares));
    }
}
