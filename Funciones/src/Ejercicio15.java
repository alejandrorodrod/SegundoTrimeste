import java.util.Scanner;

public class Ejercicio15 {
    public static void muestraPares(int n) {
        int cont = 2;
        for (int i = 0; i <= n; i++) {
            System.out.println(cont);
            cont += 2;
        }
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        int cont;
        System.out.println("Ingrese un número");
        cont = sc.nextInt();
        muestraPares(cont);
    }
}
