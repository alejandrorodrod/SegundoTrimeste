import java.util.Scanner;

public class Ejercicio14 {
    public static double distancia(double x1, double y1, double x2, double y2) {
        double resultado;
        resultado = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return resultado;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner in = new Scanner(System.in);
        double x1, y1, x2, y2;

        System.out.println("Introduce la coordenada x del primer punto: ");
        x1 = in.nextDouble();
        System.out.println("Introduce la coordenada y del primer punto: ");
        y1 = in.nextDouble();
        System.out.println("Introduce la coordenada x del segundo punto: ");
        x2 = in.nextDouble();
        System.out.println("Introduce la coordenada y del segundo punto: ");
        y2 = in.nextDouble();

        System.out.printf("%.2f", distancia(x1, y1, x2, y2));
    }
}
