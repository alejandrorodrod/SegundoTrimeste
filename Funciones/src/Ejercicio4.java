import java.util.Scanner;

public class Ejercicio4 {
    public static int maximo(int num1, int num2) {
        //Te devuelve el número más alto
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int num1, num2;
        Scanner s = new Scanner(System.in);

        //Se pide que ingrese dos números
        System.out.println("Ingrese el primer numero");
        num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = s.nextInt();
        System.out.println("El número máximo es: " + maximo(num1, num2));
    }
}
