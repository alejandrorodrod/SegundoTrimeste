import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    public static void aleatorio(int n, int mi, int ma) {
        //Se hace un bucle for para imprimir todos los números y un Random
        Random r = new Random();
        int num;
        for (int i = 0; i < n; i++) {
            num = r.nextInt(mi, ma + 1);
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        int numAl, min, max;

        //Se pide que introduzca los números
        System.out.println("Ingrese la cantidad de números aleatorios que quiere");
        numAl = sc.nextInt();
        System.out.println("Ingrese el valor mínimo");
        min = sc.nextInt();
        System.out.println("Ingrese el valor máximo");
        max = sc.nextInt();

        aleatorio(numAl, min, max);
    }
}
