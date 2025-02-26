import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Se crean las variables a usar
        int n;
        String[] colores;

        //Se crean los objetos a usar
        Scanner sc = new Scanner(System.in);
        Colores c = new Colores();

        System.out.println("Ingrese el numero de colores que necesita: ");
        n = sc.nextInt();

        colores = c.coloresUsar(n);

        for (int i = 0; i < colores.length; i++) {
            System.out.print(colores[i]);
            System.out.print(", ");
        }
    }
}
