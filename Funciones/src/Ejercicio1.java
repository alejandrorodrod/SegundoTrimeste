import java.util.Scanner;

public class Ejercicio1 {
    public static void eco(int a) {
        //Se imprime eco... el número de veces dicho
        for (int i = 0; i < a; i++) {
            System.out.println("eco...");
        }
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner s = new Scanner(System.in);
        int veces = s.nextInt();
        eco(veces);
    }
}
