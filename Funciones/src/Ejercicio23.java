import java.util.Random;

public class Ejercicio23 {
    public static void desordenar(int[] t) {
        //Se seleccionan al azar dos posiciones para intercambiar, esto sucede 5 veces
        Random rand = new Random();
        int men, pos1, pos2;

        for (int i = 0; i < 5; i++) {
            pos1 = rand.nextInt(t.length);
            pos2 = rand.nextInt(t.length);
            men = t[pos1];
            t[pos1] = t[pos2];
            t[pos2] = men;
        }
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int[] num = new int[10];
        Random rand = new Random();

        //Se rellena el array de números
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(100);
        }

        desordenar(num);
    }
}
