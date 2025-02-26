import java.util.Scanner;

public class Ejercicio16 {
    public static int segundos(int d, int h, int m) {
        //Se multiplican los días por 24, las horas por 3600 y los minutos por 60
        int resultado;
        h += d * 24;
        m += h * 60;
        resultado = m * 60;
        return resultado;
    }

    public static void main(String[] args) {
        //Se declaran las variables a usar
        Scanner teclado = new Scanner(System.in);
        int dias, horas, minutos;

        //Se pide que ingrese los valores
        System.out.print("Ingrese el número de días: ");
        dias = teclado.nextInt();
        System.out.print("Ingrese el número de horas: ");
        horas = teclado.nextInt();
        System.out.print("Ingrese el número de minutos: ");
        minutos = teclado.nextInt();

        System.out.println(segundos(dias, horas, minutos));
    }
}
