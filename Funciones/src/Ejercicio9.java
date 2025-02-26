import java.util.Scanner;

public class Ejercicio9 {
    public static int maximo(int num1, int num2, int num3) {
        //Se comprueba cuál es el mayor
        return Math.max(Math.max(num1, num2), num3);
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        int num1, num2, num3;
        Scanner s = new Scanner(System.in);

        //Se pide que ingrese dos números
        System.out.println("Ingrese el primer numero");
        num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = s.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = s.nextInt();
        System.out.println("El número máximo es: " + maximo(num1, num2, num3));
    }
}
