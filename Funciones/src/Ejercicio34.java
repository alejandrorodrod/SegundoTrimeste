import java.util.Scanner;

public class Ejercicio34 {
    public static double precioConIVA(double precio) {
        return precio * 1.21;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner sc = new Scanner(System.in);
        double precio;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el precio del producto: ");
            precio = sc.nextInt();
            System.out.printf("Precio final: %.2f", precioConIVA(precio));
            System.out.println();
        }
    }
}
