import java.util.Arrays;

public class Ejercicio32 {
    public static void vuelta(int[] n) {

        for (int i = 0; i < n.length / 2; i++) {
            int men = n[i];
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = men;
        }
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(Arrays.toString(numeros));
        vuelta(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
