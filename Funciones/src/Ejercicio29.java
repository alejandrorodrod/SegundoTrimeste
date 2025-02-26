import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio29 {
    public static int[] fechaMañana(int a, int b, int c) {
        int[] resultado = new int[3];

        //Se mira si el día es 31, si es así se suma un mes más
        if (a == 31 && (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10)) {
            resultado[0] = 1;
            resultado[1] = b + 1;
            resultado[2] = c;
            //Si el día es 31 y el mes 12 se suma un año más
        } else if (a == 31 && b == 12) {
            resultado[0] = 1;
            resultado[1] = 1;
            resultado[2] = c + 1;
        } else if (a == 30 && (b == 4 || b == 6 || b == 9 || b == 11)) {
            resultado[0] = 1;
            resultado[1] = b + 1;
            resultado[2] = c;
        } else if (a == 28 && b == 2) {
            resultado[0] = 1;
            resultado[1] = 3;
            resultado[2] = c;
            //Si no es 31 no se suma más que un día
        } else if ((a > 30 && (b == 4 || b == 6 || b == 9 || b == 11)) || a > 31 || (a > 28 && b == 2) || c == 0) {
            System.out.println("Fecha no válida");
        } else {
            resultado[0] = a + 1;
            resultado[1] = b;
            resultado[2] = c;
        }
        return resultado;
    }

    public static void main(String[] args) throws Exception {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int dia, mes, anno;

        //Se pide que introduzca la fecha
        System.out.println("Ingrese el dia:");
        dia = in.nextInt();
        System.out.println("Ingrese el mes:");
        mes = in.nextInt();
        System.out.println("Ingrese el ano:");
        anno = in.nextInt();

        System.out.println("Mañana será: " + Arrays.toString(fechaMañana(dia, mes, anno)));
    }
}
