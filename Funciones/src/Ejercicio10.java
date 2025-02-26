import java.util.Scanner;

public class Ejercicio10 {
    public static int elevar(int b, int e) {
        int resultado;

        if (e == 0) {
            resultado = 1;
        } else {
            resultado = b * elevar(b, e - 1);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;

        System.out.println("Ingrese el numero de base");
        base = sc.nextInt();
        System.out.println("Ingrese el numero de exponente");
        exponente = sc.nextInt();

        System.out.println(elevar(base, exponente));
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
