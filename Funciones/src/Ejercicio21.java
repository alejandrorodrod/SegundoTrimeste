import java.util.Random;
import java.util.Scanner;

public class Ejercicio21 {
    public static int busca(int[] t, int clave) {
        int resultado = 0;

        //Se mira el índice donde está el número que se busca
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                resultado = i;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        Random rand = new Random();
        int buscar;

        //Se pide que ingrese el número a buscar
        System.out.println("Ingrese el numero que desea buscar (del 1 al 10): ");
        buscar = in.nextInt();

        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(10);
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    i--;
                }
            }
        }

        System.out.println(busca(num, buscar));
    }
}
