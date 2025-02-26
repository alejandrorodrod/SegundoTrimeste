import java.util.Scanner;

public class Ejercicio13 {
    public static void reultado(double r) {
        double superficie;
        double volumen;

        superficie = (4 * Math.PI) * Math.pow(r, 2);
        volumen = (4 * Math.PI / 3) * Math.pow(r, 3);

        System.out.printf("%.2f\n", superficie);
        System.out.printf("%.2f", volumen);
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        double radio, altura;

        //Se pide el rádio y la altura
        System.out.println("Introduzca el rádio:");
        radio = sc.nextDouble();
        reultado(radio);
    }
}
