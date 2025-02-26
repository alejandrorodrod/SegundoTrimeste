import java.util.Arrays;
import java.util.Random;

public class Ejercicio24 {
    public static int[] desordenar(int[] t) {
        int[] array = new int[t.length];
        boolean[] usados = new boolean[t.length];
        //Se seleccionan al azar el número que va a cambiar de posición
        Random rand = new Random();
        int pos;

        for (int i = 0; i < t.length; i++) {
            pos = rand.nextInt(t.length);
            if (usados[pos] == false) {
                usados[pos] = true;
                array[i] = t[pos];
            } else {
                i--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int[] num = new int[10];
        Random rand = new Random();

        //Se rellena el array de números
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(desordenar(num)));
    }
}
