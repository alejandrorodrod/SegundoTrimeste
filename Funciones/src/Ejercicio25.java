import java.util.Scanner;

public class Ejercicio25 {
    public static int calculaEdad(int a, int b) {
        //Se hace la resta
        int resultado = a - b;
        return resultado;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        int annonac, annoact;

        //Se pide que introduzca el año de nacimiento y el actual
        System.out.println("Introduce el año en que naciste:");
        annonac = in.nextInt();
        System.out.println("Introduce el año actual:");
        annoact = in.nextInt();

        System.out.println(calculaEdad(annoact, annonac));
    }
}
